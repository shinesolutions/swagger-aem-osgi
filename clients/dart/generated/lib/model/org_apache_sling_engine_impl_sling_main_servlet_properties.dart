//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingEngineImplSlingMainServletProperties {
  /// Returns a new [OrgApacheSlingEngineImplSlingMainServletProperties] instance.
  OrgApacheSlingEngineImplSlingMainServletProperties({
    this.slingPeriodMaxPeriodCalls,
    this.slingPeriodMaxPeriodInclusions,
    this.slingPeriodTracePeriodAllow,
    this.slingPeriodMaxPeriodRecordPeriodRequests,
    this.slingPeriodStorePeriodPatternPeriodRequests,
    this.slingPeriodServerinfo,
    this.slingPeriodAdditionalPeriodResponsePeriodHeaders,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? slingPeriodMaxPeriodCalls;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? slingPeriodMaxPeriodInclusions;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? slingPeriodTracePeriodAllow;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? slingPeriodMaxPeriodRecordPeriodRequests;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? slingPeriodStorePeriodPatternPeriodRequests;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? slingPeriodServerinfo;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? slingPeriodAdditionalPeriodResponsePeriodHeaders;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingEngineImplSlingMainServletProperties &&
    other.slingPeriodMaxPeriodCalls == slingPeriodMaxPeriodCalls &&
    other.slingPeriodMaxPeriodInclusions == slingPeriodMaxPeriodInclusions &&
    other.slingPeriodTracePeriodAllow == slingPeriodTracePeriodAllow &&
    other.slingPeriodMaxPeriodRecordPeriodRequests == slingPeriodMaxPeriodRecordPeriodRequests &&
    other.slingPeriodStorePeriodPatternPeriodRequests == slingPeriodStorePeriodPatternPeriodRequests &&
    other.slingPeriodServerinfo == slingPeriodServerinfo &&
    other.slingPeriodAdditionalPeriodResponsePeriodHeaders == slingPeriodAdditionalPeriodResponsePeriodHeaders;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (slingPeriodMaxPeriodCalls == null ? 0 : slingPeriodMaxPeriodCalls!.hashCode) +
    (slingPeriodMaxPeriodInclusions == null ? 0 : slingPeriodMaxPeriodInclusions!.hashCode) +
    (slingPeriodTracePeriodAllow == null ? 0 : slingPeriodTracePeriodAllow!.hashCode) +
    (slingPeriodMaxPeriodRecordPeriodRequests == null ? 0 : slingPeriodMaxPeriodRecordPeriodRequests!.hashCode) +
    (slingPeriodStorePeriodPatternPeriodRequests == null ? 0 : slingPeriodStorePeriodPatternPeriodRequests!.hashCode) +
    (slingPeriodServerinfo == null ? 0 : slingPeriodServerinfo!.hashCode) +
    (slingPeriodAdditionalPeriodResponsePeriodHeaders == null ? 0 : slingPeriodAdditionalPeriodResponsePeriodHeaders!.hashCode);

  @override
  String toString() => 'OrgApacheSlingEngineImplSlingMainServletProperties[slingPeriodMaxPeriodCalls=$slingPeriodMaxPeriodCalls, slingPeriodMaxPeriodInclusions=$slingPeriodMaxPeriodInclusions, slingPeriodTracePeriodAllow=$slingPeriodTracePeriodAllow, slingPeriodMaxPeriodRecordPeriodRequests=$slingPeriodMaxPeriodRecordPeriodRequests, slingPeriodStorePeriodPatternPeriodRequests=$slingPeriodStorePeriodPatternPeriodRequests, slingPeriodServerinfo=$slingPeriodServerinfo, slingPeriodAdditionalPeriodResponsePeriodHeaders=$slingPeriodAdditionalPeriodResponsePeriodHeaders]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.slingPeriodMaxPeriodCalls != null) {
      json[r'sling.max.calls'] = this.slingPeriodMaxPeriodCalls;
    } else {
      json[r'sling.max.calls'] = null;
    }
    if (this.slingPeriodMaxPeriodInclusions != null) {
      json[r'sling.max.inclusions'] = this.slingPeriodMaxPeriodInclusions;
    } else {
      json[r'sling.max.inclusions'] = null;
    }
    if (this.slingPeriodTracePeriodAllow != null) {
      json[r'sling.trace.allow'] = this.slingPeriodTracePeriodAllow;
    } else {
      json[r'sling.trace.allow'] = null;
    }
    if (this.slingPeriodMaxPeriodRecordPeriodRequests != null) {
      json[r'sling.max.record.requests'] = this.slingPeriodMaxPeriodRecordPeriodRequests;
    } else {
      json[r'sling.max.record.requests'] = null;
    }
    if (this.slingPeriodStorePeriodPatternPeriodRequests != null) {
      json[r'sling.store.pattern.requests'] = this.slingPeriodStorePeriodPatternPeriodRequests;
    } else {
      json[r'sling.store.pattern.requests'] = null;
    }
    if (this.slingPeriodServerinfo != null) {
      json[r'sling.serverinfo'] = this.slingPeriodServerinfo;
    } else {
      json[r'sling.serverinfo'] = null;
    }
    if (this.slingPeriodAdditionalPeriodResponsePeriodHeaders != null) {
      json[r'sling.additional.response.headers'] = this.slingPeriodAdditionalPeriodResponsePeriodHeaders;
    } else {
      json[r'sling.additional.response.headers'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingEngineImplSlingMainServletProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingEngineImplSlingMainServletProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingEngineImplSlingMainServletProperties(
        slingPeriodMaxPeriodCalls: ConfigNodePropertyInteger.fromJson(json[r'sling.max.calls']),
        slingPeriodMaxPeriodInclusions: ConfigNodePropertyInteger.fromJson(json[r'sling.max.inclusions']),
        slingPeriodTracePeriodAllow: ConfigNodePropertyBoolean.fromJson(json[r'sling.trace.allow']),
        slingPeriodMaxPeriodRecordPeriodRequests: ConfigNodePropertyInteger.fromJson(json[r'sling.max.record.requests']),
        slingPeriodStorePeriodPatternPeriodRequests: ConfigNodePropertyArray.fromJson(json[r'sling.store.pattern.requests']),
        slingPeriodServerinfo: ConfigNodePropertyString.fromJson(json[r'sling.serverinfo']),
        slingPeriodAdditionalPeriodResponsePeriodHeaders: ConfigNodePropertyArray.fromJson(json[r'sling.additional.response.headers']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingEngineImplSlingMainServletProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingEngineImplSlingMainServletProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingEngineImplSlingMainServletProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingEngineImplSlingMainServletProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingEngineImplSlingMainServletProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingEngineImplSlingMainServletProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingEngineImplSlingMainServletProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingEngineImplSlingMainServletProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingEngineImplSlingMainServletProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingEngineImplSlingMainServletProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

