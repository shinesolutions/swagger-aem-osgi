//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties {
  /// Returns a new [OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties] instance.
  OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties({
    this.orgPeriodApachePeriodSlingPeriodScriptingPeriodSightlyPeriodJsPeriodBindings,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? orgPeriodApachePeriodSlingPeriodScriptingPeriodSightlyPeriodJsPeriodBindings;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties &&
    other.orgPeriodApachePeriodSlingPeriodScriptingPeriodSightlyPeriodJsPeriodBindings == orgPeriodApachePeriodSlingPeriodScriptingPeriodSightlyPeriodJsPeriodBindings;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (orgPeriodApachePeriodSlingPeriodScriptingPeriodSightlyPeriodJsPeriodBindings == null ? 0 : orgPeriodApachePeriodSlingPeriodScriptingPeriodSightlyPeriodJsPeriodBindings!.hashCode);

  @override
  String toString() => 'OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties[orgPeriodApachePeriodSlingPeriodScriptingPeriodSightlyPeriodJsPeriodBindings=$orgPeriodApachePeriodSlingPeriodScriptingPeriodSightlyPeriodJsPeriodBindings]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.orgPeriodApachePeriodSlingPeriodScriptingPeriodSightlyPeriodJsPeriodBindings != null) {
      json[r'org.apache.sling.scripting.sightly.js.bindings'] = this.orgPeriodApachePeriodSlingPeriodScriptingPeriodSightlyPeriodJsPeriodBindings;
    } else {
      json[r'org.apache.sling.scripting.sightly.js.bindings'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties(
        orgPeriodApachePeriodSlingPeriodScriptingPeriodSightlyPeriodJsPeriodBindings: ConfigNodePropertyArray.fromJson(json[r'org.apache.sling.scripting.sightly.js.bindings']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

