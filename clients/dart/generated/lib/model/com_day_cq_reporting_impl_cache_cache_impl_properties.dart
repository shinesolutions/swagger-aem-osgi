//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqReportingImplCacheCacheImplProperties {
  /// Returns a new [ComDayCqReportingImplCacheCacheImplProperties] instance.
  ComDayCqReportingImplCacheCacheImplProperties({
    this.repcachePeriodEnable,
    this.repcachePeriodTtl,
    this.repcachePeriodMax,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? repcachePeriodEnable;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? repcachePeriodTtl;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? repcachePeriodMax;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqReportingImplCacheCacheImplProperties &&
    other.repcachePeriodEnable == repcachePeriodEnable &&
    other.repcachePeriodTtl == repcachePeriodTtl &&
    other.repcachePeriodMax == repcachePeriodMax;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (repcachePeriodEnable == null ? 0 : repcachePeriodEnable!.hashCode) +
    (repcachePeriodTtl == null ? 0 : repcachePeriodTtl!.hashCode) +
    (repcachePeriodMax == null ? 0 : repcachePeriodMax!.hashCode);

  @override
  String toString() => 'ComDayCqReportingImplCacheCacheImplProperties[repcachePeriodEnable=$repcachePeriodEnable, repcachePeriodTtl=$repcachePeriodTtl, repcachePeriodMax=$repcachePeriodMax]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.repcachePeriodEnable != null) {
      json[r'repcache.enable'] = this.repcachePeriodEnable;
    } else {
      json[r'repcache.enable'] = null;
    }
    if (this.repcachePeriodTtl != null) {
      json[r'repcache.ttl'] = this.repcachePeriodTtl;
    } else {
      json[r'repcache.ttl'] = null;
    }
    if (this.repcachePeriodMax != null) {
      json[r'repcache.max'] = this.repcachePeriodMax;
    } else {
      json[r'repcache.max'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqReportingImplCacheCacheImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqReportingImplCacheCacheImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqReportingImplCacheCacheImplProperties(
        repcachePeriodEnable: ConfigNodePropertyBoolean.fromJson(json[r'repcache.enable']),
        repcachePeriodTtl: ConfigNodePropertyInteger.fromJson(json[r'repcache.ttl']),
        repcachePeriodMax: ConfigNodePropertyInteger.fromJson(json[r'repcache.max']),
      );
    }
    return null;
  }

  static List<ComDayCqReportingImplCacheCacheImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqReportingImplCacheCacheImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqReportingImplCacheCacheImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqReportingImplCacheCacheImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqReportingImplCacheCacheImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqReportingImplCacheCacheImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqReportingImplCacheCacheImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqReportingImplCacheCacheImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqReportingImplCacheCacheImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqReportingImplCacheCacheImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

