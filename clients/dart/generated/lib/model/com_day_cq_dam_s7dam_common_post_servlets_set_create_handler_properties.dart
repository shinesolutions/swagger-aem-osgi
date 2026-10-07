//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties {
  /// Returns a new [ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties] instance.
  ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties({
    this.slingPeriodPostPeriodOperation,
    this.slingPeriodServletPeriodMethods,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? slingPeriodPostPeriodOperation;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? slingPeriodServletPeriodMethods;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties &&
    other.slingPeriodPostPeriodOperation == slingPeriodPostPeriodOperation &&
    other.slingPeriodServletPeriodMethods == slingPeriodServletPeriodMethods;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (slingPeriodPostPeriodOperation == null ? 0 : slingPeriodPostPeriodOperation!.hashCode) +
    (slingPeriodServletPeriodMethods == null ? 0 : slingPeriodServletPeriodMethods!.hashCode);

  @override
  String toString() => 'ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties[slingPeriodPostPeriodOperation=$slingPeriodPostPeriodOperation, slingPeriodServletPeriodMethods=$slingPeriodServletPeriodMethods]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.slingPeriodPostPeriodOperation != null) {
      json[r'sling.post.operation'] = this.slingPeriodPostPeriodOperation;
    } else {
      json[r'sling.post.operation'] = null;
    }
    if (this.slingPeriodServletPeriodMethods != null) {
      json[r'sling.servlet.methods'] = this.slingPeriodServletPeriodMethods;
    } else {
      json[r'sling.servlet.methods'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties(
        slingPeriodPostPeriodOperation: ConfigNodePropertyString.fromJson(json[r'sling.post.operation']),
        slingPeriodServletPeriodMethods: ConfigNodePropertyString.fromJson(json[r'sling.servlet.methods']),
      );
    }
    return null;
  }

  static List<ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

