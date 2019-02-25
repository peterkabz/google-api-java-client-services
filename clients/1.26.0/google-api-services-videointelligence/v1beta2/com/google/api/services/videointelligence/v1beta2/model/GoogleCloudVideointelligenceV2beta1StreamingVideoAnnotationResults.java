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
 * Streaming annotation results corresponding to a portion of the video that is currently being
 * processed.
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
public final class GoogleCloudVideointelligenceV2beta1StreamingVideoAnnotationResults extends com.google.api.client.json.GenericJson {

  /**
   * Explicit content annotation results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVideointelligenceV2beta1ExplicitContentAnnotation explicitAnnotation;

  /**
   * Label annotation results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVideointelligenceV2beta1LabelAnnotation> labelAnnotations;

  static {
    // hack to force ProGuard to consider GoogleCloudVideointelligenceV2beta1LabelAnnotation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudVideointelligenceV2beta1LabelAnnotation.class);
  }

  /**
   * Object tracking results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVideointelligenceV2beta1ObjectTrackingAnnotation> objectAnnotations;

  static {
    // hack to force ProGuard to consider GoogleCloudVideointelligenceV2beta1ObjectTrackingAnnotation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudVideointelligenceV2beta1ObjectTrackingAnnotation.class);
  }

  /**
   * Shot annotation results. Each shot is represented as a video segment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVideointelligenceV2beta1VideoSegment> shotAnnotations;

  /**
   * Explicit content annotation results.
   * @return value or {@code null} for none
   */
  public GoogleCloudVideointelligenceV2beta1ExplicitContentAnnotation getExplicitAnnotation() {
    return explicitAnnotation;
  }

  /**
   * Explicit content annotation results.
   * @param explicitAnnotation explicitAnnotation or {@code null} for none
   */
  public GoogleCloudVideointelligenceV2beta1StreamingVideoAnnotationResults setExplicitAnnotation(GoogleCloudVideointelligenceV2beta1ExplicitContentAnnotation explicitAnnotation) {
    this.explicitAnnotation = explicitAnnotation;
    return this;
  }

  /**
   * Label annotation results.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVideointelligenceV2beta1LabelAnnotation> getLabelAnnotations() {
    return labelAnnotations;
  }

  /**
   * Label annotation results.
   * @param labelAnnotations labelAnnotations or {@code null} for none
   */
  public GoogleCloudVideointelligenceV2beta1StreamingVideoAnnotationResults setLabelAnnotations(java.util.List<GoogleCloudVideointelligenceV2beta1LabelAnnotation> labelAnnotations) {
    this.labelAnnotations = labelAnnotations;
    return this;
  }

  /**
   * Object tracking results.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVideointelligenceV2beta1ObjectTrackingAnnotation> getObjectAnnotations() {
    return objectAnnotations;
  }

  /**
   * Object tracking results.
   * @param objectAnnotations objectAnnotations or {@code null} for none
   */
  public GoogleCloudVideointelligenceV2beta1StreamingVideoAnnotationResults setObjectAnnotations(java.util.List<GoogleCloudVideointelligenceV2beta1ObjectTrackingAnnotation> objectAnnotations) {
    this.objectAnnotations = objectAnnotations;
    return this;
  }

  /**
   * Shot annotation results. Each shot is represented as a video segment.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVideointelligenceV2beta1VideoSegment> getShotAnnotations() {
    return shotAnnotations;
  }

  /**
   * Shot annotation results. Each shot is represented as a video segment.
   * @param shotAnnotations shotAnnotations or {@code null} for none
   */
  public GoogleCloudVideointelligenceV2beta1StreamingVideoAnnotationResults setShotAnnotations(java.util.List<GoogleCloudVideointelligenceV2beta1VideoSegment> shotAnnotations) {
    this.shotAnnotations = shotAnnotations;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV2beta1StreamingVideoAnnotationResults set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV2beta1StreamingVideoAnnotationResults) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV2beta1StreamingVideoAnnotationResults clone() {
    return (GoogleCloudVideointelligenceV2beta1StreamingVideoAnnotationResults) super.clone();
  }

}
