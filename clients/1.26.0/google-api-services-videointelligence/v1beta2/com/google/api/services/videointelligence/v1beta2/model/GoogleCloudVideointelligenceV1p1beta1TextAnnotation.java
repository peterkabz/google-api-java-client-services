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

package com.google.api.services.videointelligence.v1beta2.model;

/**
 * Annotations related to one detected OCR text snippet. This will contain the corresponding text,
 * confidence value, and frame level information for each detection.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Video Intelligence API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVideointelligenceV1p1beta1TextAnnotation extends com.google.api.client.json.GenericJson {

  /**
   * All video segments where OCR detected text appears.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVideointelligenceV1p1beta1TextSegment> segments;

  /**
   * The detected text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String text;

  /**
   * All video segments where OCR detected text appears.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVideointelligenceV1p1beta1TextSegment> getSegments() {
    return segments;
  }

  /**
   * All video segments where OCR detected text appears.
   * @param segments segments or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1TextAnnotation setSegments(java.util.List<GoogleCloudVideointelligenceV1p1beta1TextSegment> segments) {
    this.segments = segments;
    return this;
  }

  /**
   * The detected text.
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * The detected text.
   * @param text text or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1TextAnnotation setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1p1beta1TextAnnotation set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1p1beta1TextAnnotation) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1p1beta1TextAnnotation clone() {
    return (GoogleCloudVideointelligenceV1p1beta1TextAnnotation) super.clone();
  }

}
