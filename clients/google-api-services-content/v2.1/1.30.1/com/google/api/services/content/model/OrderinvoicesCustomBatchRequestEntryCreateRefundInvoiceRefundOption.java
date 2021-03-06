/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.content.model;

/**
 * Model definition for OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption extends com.google.api.client.json.GenericJson {

  /**
   * Optional description of the refund reason.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * [required] Reason for the refund.
   *
   * Acceptable values are:   - "adjustment"  - "autoPostInternal"  -
   * "autoPostInvalidBillingAddress"  - "autoPostNoInventory"  - "autoPostPriceError"  -
   * "autoPostUndeliverableShippingAddress"  - "couponAbuse"  - "courtesyAdjustment"  -
   * "customerCanceled"  - "customerDiscretionaryReturn"  - "customerInitiatedMerchantCancel"  -
   * "customerSupportRequested"  - "deliveredLateByCarrier"  - "deliveredTooLate"  - "expiredItem"
   * - "failToPushOrderGoogleError"  - "failToPushOrderMerchantError"  -
   * "failToPushOrderMerchantFulfillmentError"  - "failToPushOrderToMerchant"  -
   * "failToPushOrderToMerchantOutOfStock"  - "feeAdjustment"  - "invalidCoupon"  -
   * "lateShipmentCredit"  - "malformedShippingAddress"  - "merchantDidNotShipOnTime"  -
   * "noInventory"  - "orderTimeout"  - "other"  - "paymentAbuse"  - "paymentDeclined"  -
   * "priceAdjustment"  - "priceError"  - "productArrivedDamaged"  - "productNotAsDescribed"  -
   * "promoReallocation"  - "qualityNotAsExpected"  - "returnRefundAbuse"  -
   * "shippingCostAdjustment"  - "shippingPriceError"  - "taxAdjustment"  - "taxError"  -
   * "undeliverableShippingAddress"  - "unsupportedPoBoxAddress"  - "wrongProductShipped"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reason;

  /**
   * Optional description of the refund reason.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional description of the refund reason.
   * @param description description or {@code null} for none
   */
  public OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * [required] Reason for the refund.
   *
   * Acceptable values are:   - "adjustment"  - "autoPostInternal"  -
   * "autoPostInvalidBillingAddress"  - "autoPostNoInventory"  - "autoPostPriceError"  -
   * "autoPostUndeliverableShippingAddress"  - "couponAbuse"  - "courtesyAdjustment"  -
   * "customerCanceled"  - "customerDiscretionaryReturn"  - "customerInitiatedMerchantCancel"  -
   * "customerSupportRequested"  - "deliveredLateByCarrier"  - "deliveredTooLate"  - "expiredItem"
   * - "failToPushOrderGoogleError"  - "failToPushOrderMerchantError"  -
   * "failToPushOrderMerchantFulfillmentError"  - "failToPushOrderToMerchant"  -
   * "failToPushOrderToMerchantOutOfStock"  - "feeAdjustment"  - "invalidCoupon"  -
   * "lateShipmentCredit"  - "malformedShippingAddress"  - "merchantDidNotShipOnTime"  -
   * "noInventory"  - "orderTimeout"  - "other"  - "paymentAbuse"  - "paymentDeclined"  -
   * "priceAdjustment"  - "priceError"  - "productArrivedDamaged"  - "productNotAsDescribed"  -
   * "promoReallocation"  - "qualityNotAsExpected"  - "returnRefundAbuse"  -
   * "shippingCostAdjustment"  - "shippingPriceError"  - "taxAdjustment"  - "taxError"  -
   * "undeliverableShippingAddress"  - "unsupportedPoBoxAddress"  - "wrongProductShipped"
   * @return value or {@code null} for none
   */
  public java.lang.String getReason() {
    return reason;
  }

  /**
   * [required] Reason for the refund.
   *
   * Acceptable values are:   - "adjustment"  - "autoPostInternal"  -
   * "autoPostInvalidBillingAddress"  - "autoPostNoInventory"  - "autoPostPriceError"  -
   * "autoPostUndeliverableShippingAddress"  - "couponAbuse"  - "courtesyAdjustment"  -
   * "customerCanceled"  - "customerDiscretionaryReturn"  - "customerInitiatedMerchantCancel"  -
   * "customerSupportRequested"  - "deliveredLateByCarrier"  - "deliveredTooLate"  - "expiredItem"
   * - "failToPushOrderGoogleError"  - "failToPushOrderMerchantError"  -
   * "failToPushOrderMerchantFulfillmentError"  - "failToPushOrderToMerchant"  -
   * "failToPushOrderToMerchantOutOfStock"  - "feeAdjustment"  - "invalidCoupon"  -
   * "lateShipmentCredit"  - "malformedShippingAddress"  - "merchantDidNotShipOnTime"  -
   * "noInventory"  - "orderTimeout"  - "other"  - "paymentAbuse"  - "paymentDeclined"  -
   * "priceAdjustment"  - "priceError"  - "productArrivedDamaged"  - "productNotAsDescribed"  -
   * "promoReallocation"  - "qualityNotAsExpected"  - "returnRefundAbuse"  -
   * "shippingCostAdjustment"  - "shippingPriceError"  - "taxAdjustment"  - "taxError"  -
   * "undeliverableShippingAddress"  - "unsupportedPoBoxAddress"  - "wrongProductShipped"
   * @param reason reason or {@code null} for none
   */
  public OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption setReason(java.lang.String reason) {
    this.reason = reason;
    return this;
  }

  @Override
  public OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption set(String fieldName, Object value) {
    return (OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption) super.set(fieldName, value);
  }

  @Override
  public OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption clone() {
    return (OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption) super.clone();
  }

}
