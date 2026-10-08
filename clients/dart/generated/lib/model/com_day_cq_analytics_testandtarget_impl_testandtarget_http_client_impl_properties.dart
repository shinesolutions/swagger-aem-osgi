//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties {
  /// Returns a new [ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties] instance.
  ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties({
    this.cqPeriodAnalyticsPeriodTestandtargetPeriodApiPeriodUrl,
    this.cqPeriodAnalyticsPeriodTestandtargetPeriodTimeout,
    this.cqPeriodAnalyticsPeriodTestandtargetPeriodSockettimeout,
    this.cqPeriodAnalyticsPeriodTestandtargetPeriodRecommendationsPeriodUrlPeriodReplace,
    this.cqPeriodAnalyticsPeriodTestandtargetPeriodRecommendationsPeriodUrlPeriodReplacewith,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? cqPeriodAnalyticsPeriodTestandtargetPeriodApiPeriodUrl;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? cqPeriodAnalyticsPeriodTestandtargetPeriodTimeout;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? cqPeriodAnalyticsPeriodTestandtargetPeriodSockettimeout;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? cqPeriodAnalyticsPeriodTestandtargetPeriodRecommendationsPeriodUrlPeriodReplace;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? cqPeriodAnalyticsPeriodTestandtargetPeriodRecommendationsPeriodUrlPeriodReplacewith;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties &&
    other.cqPeriodAnalyticsPeriodTestandtargetPeriodApiPeriodUrl == cqPeriodAnalyticsPeriodTestandtargetPeriodApiPeriodUrl &&
    other.cqPeriodAnalyticsPeriodTestandtargetPeriodTimeout == cqPeriodAnalyticsPeriodTestandtargetPeriodTimeout &&
    other.cqPeriodAnalyticsPeriodTestandtargetPeriodSockettimeout == cqPeriodAnalyticsPeriodTestandtargetPeriodSockettimeout &&
    other.cqPeriodAnalyticsPeriodTestandtargetPeriodRecommendationsPeriodUrlPeriodReplace == cqPeriodAnalyticsPeriodTestandtargetPeriodRecommendationsPeriodUrlPeriodReplace &&
    other.cqPeriodAnalyticsPeriodTestandtargetPeriodRecommendationsPeriodUrlPeriodReplacewith == cqPeriodAnalyticsPeriodTestandtargetPeriodRecommendationsPeriodUrlPeriodReplacewith;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cqPeriodAnalyticsPeriodTestandtargetPeriodApiPeriodUrl == null ? 0 : cqPeriodAnalyticsPeriodTestandtargetPeriodApiPeriodUrl!.hashCode) +
    (cqPeriodAnalyticsPeriodTestandtargetPeriodTimeout == null ? 0 : cqPeriodAnalyticsPeriodTestandtargetPeriodTimeout!.hashCode) +
    (cqPeriodAnalyticsPeriodTestandtargetPeriodSockettimeout == null ? 0 : cqPeriodAnalyticsPeriodTestandtargetPeriodSockettimeout!.hashCode) +
    (cqPeriodAnalyticsPeriodTestandtargetPeriodRecommendationsPeriodUrlPeriodReplace == null ? 0 : cqPeriodAnalyticsPeriodTestandtargetPeriodRecommendationsPeriodUrlPeriodReplace!.hashCode) +
    (cqPeriodAnalyticsPeriodTestandtargetPeriodRecommendationsPeriodUrlPeriodReplacewith == null ? 0 : cqPeriodAnalyticsPeriodTestandtargetPeriodRecommendationsPeriodUrlPeriodReplacewith!.hashCode);

  @override
  String toString() => 'ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties[cqPeriodAnalyticsPeriodTestandtargetPeriodApiPeriodUrl=$cqPeriodAnalyticsPeriodTestandtargetPeriodApiPeriodUrl, cqPeriodAnalyticsPeriodTestandtargetPeriodTimeout=$cqPeriodAnalyticsPeriodTestandtargetPeriodTimeout, cqPeriodAnalyticsPeriodTestandtargetPeriodSockettimeout=$cqPeriodAnalyticsPeriodTestandtargetPeriodSockettimeout, cqPeriodAnalyticsPeriodTestandtargetPeriodRecommendationsPeriodUrlPeriodReplace=$cqPeriodAnalyticsPeriodTestandtargetPeriodRecommendationsPeriodUrlPeriodReplace, cqPeriodAnalyticsPeriodTestandtargetPeriodRecommendationsPeriodUrlPeriodReplacewith=$cqPeriodAnalyticsPeriodTestandtargetPeriodRecommendationsPeriodUrlPeriodReplacewith]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cqPeriodAnalyticsPeriodTestandtargetPeriodApiPeriodUrl != null) {
      json[r'cq.analytics.testandtarget.api.url'] = this.cqPeriodAnalyticsPeriodTestandtargetPeriodApiPeriodUrl;
    } else {
      json[r'cq.analytics.testandtarget.api.url'] = null;
    }
    if (this.cqPeriodAnalyticsPeriodTestandtargetPeriodTimeout != null) {
      json[r'cq.analytics.testandtarget.timeout'] = this.cqPeriodAnalyticsPeriodTestandtargetPeriodTimeout;
    } else {
      json[r'cq.analytics.testandtarget.timeout'] = null;
    }
    if (this.cqPeriodAnalyticsPeriodTestandtargetPeriodSockettimeout != null) {
      json[r'cq.analytics.testandtarget.sockettimeout'] = this.cqPeriodAnalyticsPeriodTestandtargetPeriodSockettimeout;
    } else {
      json[r'cq.analytics.testandtarget.sockettimeout'] = null;
    }
    if (this.cqPeriodAnalyticsPeriodTestandtargetPeriodRecommendationsPeriodUrlPeriodReplace != null) {
      json[r'cq.analytics.testandtarget.recommendations.url.replace'] = this.cqPeriodAnalyticsPeriodTestandtargetPeriodRecommendationsPeriodUrlPeriodReplace;
    } else {
      json[r'cq.analytics.testandtarget.recommendations.url.replace'] = null;
    }
    if (this.cqPeriodAnalyticsPeriodTestandtargetPeriodRecommendationsPeriodUrlPeriodReplacewith != null) {
      json[r'cq.analytics.testandtarget.recommendations.url.replacewith'] = this.cqPeriodAnalyticsPeriodTestandtargetPeriodRecommendationsPeriodUrlPeriodReplacewith;
    } else {
      json[r'cq.analytics.testandtarget.recommendations.url.replacewith'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties(
        cqPeriodAnalyticsPeriodTestandtargetPeriodApiPeriodUrl: ConfigNodePropertyString.fromJson(json[r'cq.analytics.testandtarget.api.url']),
        cqPeriodAnalyticsPeriodTestandtargetPeriodTimeout: ConfigNodePropertyInteger.fromJson(json[r'cq.analytics.testandtarget.timeout']),
        cqPeriodAnalyticsPeriodTestandtargetPeriodSockettimeout: ConfigNodePropertyInteger.fromJson(json[r'cq.analytics.testandtarget.sockettimeout']),
        cqPeriodAnalyticsPeriodTestandtargetPeriodRecommendationsPeriodUrlPeriodReplace: ConfigNodePropertyString.fromJson(json[r'cq.analytics.testandtarget.recommendations.url.replace']),
        cqPeriodAnalyticsPeriodTestandtargetPeriodRecommendationsPeriodUrlPeriodReplacewith: ConfigNodePropertyString.fromJson(json[r'cq.analytics.testandtarget.recommendations.url.replacewith']),
      );
    }
    return null;
  }

  static List<ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

