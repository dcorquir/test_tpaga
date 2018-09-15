/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object ListAccountsApi {

  /**
   * Endpoint to list acounts registered on the store
   * 
   * Expected answers:
   *   code 200 :  (Response whit accounts list on json format)
   */
  def accountsGet(): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://virtserver.swaggerhub.com/DIXMA/test_tpaga/0.0.1", "/accounts", "application/json")
      .withSuccessResponse[Unit](200)
      

}

