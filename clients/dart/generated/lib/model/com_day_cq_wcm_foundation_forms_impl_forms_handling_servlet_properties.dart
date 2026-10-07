//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties {
  /// Returns a new [ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties] instance.
  ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties({
    this.namePeriodWhitelist,
    this.allowPeriodExpressions,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? namePeriodWhitelist;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? allowPeriodExpressions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties &&
    other.namePeriodWhitelist == namePeriodWhitelist &&
    other.allowPeriodExpressions == allowPeriodExpressions;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (namePeriodWhitelist == null ? 0 : namePeriodWhitelist!.hashCode) +
    (allowPeriodExpressions == null ? 0 : allowPeriodExpressions!.hashCode);

  @override
  String toString() => 'ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties[namePeriodWhitelist=$namePeriodWhitelist, allowPeriodExpressions=$allowPeriodExpressions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.namePeriodWhitelist != null) {
      json[r'name.whitelist'] = this.namePeriodWhitelist;
    } else {
      json[r'name.whitelist'] = null;
    }
    if (this.allowPeriodExpressions != null) {
      json[r'allow.expressions'] = this.allowPeriodExpressions;
    } else {
      json[r'allow.expressions'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties(
        namePeriodWhitelist: ConfigNodePropertyString.fromJson(json[r'name.whitelist']),
        allowPeriodExpressions: ConfigNodePropertyBoolean.fromJson(json[r'allow.expressions']),
      );
    }
    return null;
  }

  static List<ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties-objects as value to a dart map
  static Map<String, List<ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

