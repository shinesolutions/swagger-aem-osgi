//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqWcmCoreStatsPageViewStatisticsImplProperties {
  /// Returns a new [ComDayCqWcmCoreStatsPageViewStatisticsImplProperties] instance.
  ComDayCqWcmCoreStatsPageViewStatisticsImplProperties({
    this.pageviewstatisticsPeriodTrackingurl,
    this.pageviewstatisticsPeriodTrackingscriptPeriodEnabled,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? pageviewstatisticsPeriodTrackingurl;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? pageviewstatisticsPeriodTrackingscriptPeriodEnabled;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqWcmCoreStatsPageViewStatisticsImplProperties &&
    other.pageviewstatisticsPeriodTrackingurl == pageviewstatisticsPeriodTrackingurl &&
    other.pageviewstatisticsPeriodTrackingscriptPeriodEnabled == pageviewstatisticsPeriodTrackingscriptPeriodEnabled;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (pageviewstatisticsPeriodTrackingurl == null ? 0 : pageviewstatisticsPeriodTrackingurl!.hashCode) +
    (pageviewstatisticsPeriodTrackingscriptPeriodEnabled == null ? 0 : pageviewstatisticsPeriodTrackingscriptPeriodEnabled!.hashCode);

  @override
  String toString() => 'ComDayCqWcmCoreStatsPageViewStatisticsImplProperties[pageviewstatisticsPeriodTrackingurl=$pageviewstatisticsPeriodTrackingurl, pageviewstatisticsPeriodTrackingscriptPeriodEnabled=$pageviewstatisticsPeriodTrackingscriptPeriodEnabled]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.pageviewstatisticsPeriodTrackingurl != null) {
      json[r'pageviewstatistics.trackingurl'] = this.pageviewstatisticsPeriodTrackingurl;
    } else {
      json[r'pageviewstatistics.trackingurl'] = null;
    }
    if (this.pageviewstatisticsPeriodTrackingscriptPeriodEnabled != null) {
      json[r'pageviewstatistics.trackingscript.enabled'] = this.pageviewstatisticsPeriodTrackingscriptPeriodEnabled;
    } else {
      json[r'pageviewstatistics.trackingscript.enabled'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqWcmCoreStatsPageViewStatisticsImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqWcmCoreStatsPageViewStatisticsImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqWcmCoreStatsPageViewStatisticsImplProperties(
        pageviewstatisticsPeriodTrackingurl: ConfigNodePropertyString.fromJson(json[r'pageviewstatistics.trackingurl']),
        pageviewstatisticsPeriodTrackingscriptPeriodEnabled: ConfigNodePropertyString.fromJson(json[r'pageviewstatistics.trackingscript.enabled']),
      );
    }
    return null;
  }

  static List<ComDayCqWcmCoreStatsPageViewStatisticsImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqWcmCoreStatsPageViewStatisticsImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqWcmCoreStatsPageViewStatisticsImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqWcmCoreStatsPageViewStatisticsImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqWcmCoreStatsPageViewStatisticsImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqWcmCoreStatsPageViewStatisticsImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqWcmCoreStatsPageViewStatisticsImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqWcmCoreStatsPageViewStatisticsImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqWcmCoreStatsPageViewStatisticsImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqWcmCoreStatsPageViewStatisticsImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

