//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties {
  /// Returns a new [OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties] instance.
  OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties({
    this.orgPeriodApachePeriodSlingPeriodScriptingPeriodJavascriptPeriodRhinoPeriodOptLevel,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? orgPeriodApachePeriodSlingPeriodScriptingPeriodJavascriptPeriodRhinoPeriodOptLevel;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties &&
    other.orgPeriodApachePeriodSlingPeriodScriptingPeriodJavascriptPeriodRhinoPeriodOptLevel == orgPeriodApachePeriodSlingPeriodScriptingPeriodJavascriptPeriodRhinoPeriodOptLevel;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (orgPeriodApachePeriodSlingPeriodScriptingPeriodJavascriptPeriodRhinoPeriodOptLevel == null ? 0 : orgPeriodApachePeriodSlingPeriodScriptingPeriodJavascriptPeriodRhinoPeriodOptLevel!.hashCode);

  @override
  String toString() => 'OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties[orgPeriodApachePeriodSlingPeriodScriptingPeriodJavascriptPeriodRhinoPeriodOptLevel=$orgPeriodApachePeriodSlingPeriodScriptingPeriodJavascriptPeriodRhinoPeriodOptLevel]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.orgPeriodApachePeriodSlingPeriodScriptingPeriodJavascriptPeriodRhinoPeriodOptLevel != null) {
      json[r'org.apache.sling.scripting.javascript.rhino.optLevel'] = this.orgPeriodApachePeriodSlingPeriodScriptingPeriodJavascriptPeriodRhinoPeriodOptLevel;
    } else {
      json[r'org.apache.sling.scripting.javascript.rhino.optLevel'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties(
        orgPeriodApachePeriodSlingPeriodScriptingPeriodJavascriptPeriodRhinoPeriodOptLevel: ConfigNodePropertyInteger.fromJson(json[r'org.apache.sling.scripting.javascript.rhino.optLevel']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

