package com.oneops.infoblox;

import com.oneops.infoblox.model.Result;
import com.oneops.infoblox.model.zone.ZoneAuth;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Infoblox DNS appliance (IBA) REST interface.
 *
 * @author Suresh G
 */
public interface Infoblox {

  @GET("zone_auth")
  Call<Result<List<ZoneAuth>>> getAuthZones();

  @GET("zone_auth")
  Call<Result<List<ZoneAuth>>> getAuthZone(@Query("fqdn~") String fqdn);

  @POST("logout")
  Call<Void> logout();
}
