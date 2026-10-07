//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingHcCoreImplCompositeHealthCheckProperties {
  /// Returns a new [OrgApacheSlingHcCoreImplCompositeHealthCheckProperties] instance.
  OrgApacheSlingHcCoreImplCompositeHealthCheckProperties({
    this.hcPeriodName,
    this.hcPeriodTags,
    this.hcPeriodMbeanPeriodName,
    this.filterPeriodTags,
    this.filterPeriodCombineTagsWithOr,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? hcPeriodName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? hcPeriodTags;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? hcPeriodMbeanPeriodName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? filterPeriodTags;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? filterPeriodCombineTagsWithOr;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingHcCoreImplCompositeHealthCheckProperties &&
    other.hcPeriodName == hcPeriodName &&
    other.hcPeriodTags == hcPeriodTags &&
    other.hcPeriodMbeanPeriodName == hcPeriodMbeanPeriodName &&
    other.filterPeriodTags == filterPeriodTags &&
    other.filterPeriodCombineTagsWithOr == filterPeriodCombineTagsWithOr;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (hcPeriodName == null ? 0 : hcPeriodName!.hashCode) +
    (hcPeriodTags == null ? 0 : hcPeriodTags!.hashCode) +
    (hcPeriodMbeanPeriodName == null ? 0 : hcPeriodMbeanPeriodName!.hashCode) +
    (filterPeriodTags == null ? 0 : filterPeriodTags!.hashCode) +
    (filterPeriodCombineTagsWithOr == null ? 0 : filterPeriodCombineTagsWithOr!.hashCode);

  @override
  String toString() => 'OrgApacheSlingHcCoreImplCompositeHealthCheckProperties[hcPeriodName=$hcPeriodName, hcPeriodTags=$hcPeriodTags, hcPeriodMbeanPeriodName=$hcPeriodMbeanPeriodName, filterPeriodTags=$filterPeriodTags, filterPeriodCombineTagsWithOr=$filterPeriodCombineTagsWithOr]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.hcPeriodName != null) {
      json[r'hc.name'] = this.hcPeriodName;
    } else {
      json[r'hc.name'] = null;
    }
    if (this.hcPeriodTags != null) {
      json[r'hc.tags'] = this.hcPeriodTags;
    } else {
      json[r'hc.tags'] = null;
    }
    if (this.hcPeriodMbeanPeriodName != null) {
      json[r'hc.mbean.name'] = this.hcPeriodMbeanPeriodName;
    } else {
      json[r'hc.mbean.name'] = null;
    }
    if (this.filterPeriodTags != null) {
      json[r'filter.tags'] = this.filterPeriodTags;
    } else {
      json[r'filter.tags'] = null;
    }
    if (this.filterPeriodCombineTagsWithOr != null) {
      json[r'filter.combineTagsWithOr'] = this.filterPeriodCombineTagsWithOr;
    } else {
      json[r'filter.combineTagsWithOr'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingHcCoreImplCompositeHealthCheckProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingHcCoreImplCompositeHealthCheckProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingHcCoreImplCompositeHealthCheckProperties(
        hcPeriodName: ConfigNodePropertyString.fromJson(json[r'hc.name']),
        hcPeriodTags: ConfigNodePropertyArray.fromJson(json[r'hc.tags']),
        hcPeriodMbeanPeriodName: ConfigNodePropertyString.fromJson(json[r'hc.mbean.name']),
        filterPeriodTags: ConfigNodePropertyArray.fromJson(json[r'filter.tags']),
        filterPeriodCombineTagsWithOr: ConfigNodePropertyBoolean.fromJson(json[r'filter.combineTagsWithOr']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingHcCoreImplCompositeHealthCheckProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingHcCoreImplCompositeHealthCheckProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingHcCoreImplCompositeHealthCheckProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingHcCoreImplCompositeHealthCheckProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingHcCoreImplCompositeHealthCheckProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingHcCoreImplCompositeHealthCheckProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingHcCoreImplCompositeHealthCheckProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

