//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqAuthImplCugCugSupportImplProperties {
  /// Returns a new [ComDayCqAuthImplCugCugSupportImplProperties] instance.
  ComDayCqAuthImplCugCugSupportImplProperties({
    this.cugPeriodExemptedPeriodPrincipals,
    this.cugPeriodEnabled,
    this.cugPeriodPrincipalsPeriodRegex,
    this.cugPeriodPrincipalsPeriodReplacement,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? cugPeriodExemptedPeriodPrincipals;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? cugPeriodEnabled;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? cugPeriodPrincipalsPeriodRegex;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? cugPeriodPrincipalsPeriodReplacement;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqAuthImplCugCugSupportImplProperties &&
    other.cugPeriodExemptedPeriodPrincipals == cugPeriodExemptedPeriodPrincipals &&
    other.cugPeriodEnabled == cugPeriodEnabled &&
    other.cugPeriodPrincipalsPeriodRegex == cugPeriodPrincipalsPeriodRegex &&
    other.cugPeriodPrincipalsPeriodReplacement == cugPeriodPrincipalsPeriodReplacement;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cugPeriodExemptedPeriodPrincipals == null ? 0 : cugPeriodExemptedPeriodPrincipals!.hashCode) +
    (cugPeriodEnabled == null ? 0 : cugPeriodEnabled!.hashCode) +
    (cugPeriodPrincipalsPeriodRegex == null ? 0 : cugPeriodPrincipalsPeriodRegex!.hashCode) +
    (cugPeriodPrincipalsPeriodReplacement == null ? 0 : cugPeriodPrincipalsPeriodReplacement!.hashCode);

  @override
  String toString() => 'ComDayCqAuthImplCugCugSupportImplProperties[cugPeriodExemptedPeriodPrincipals=$cugPeriodExemptedPeriodPrincipals, cugPeriodEnabled=$cugPeriodEnabled, cugPeriodPrincipalsPeriodRegex=$cugPeriodPrincipalsPeriodRegex, cugPeriodPrincipalsPeriodReplacement=$cugPeriodPrincipalsPeriodReplacement]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cugPeriodExemptedPeriodPrincipals != null) {
      json[r'cug.exempted.principals'] = this.cugPeriodExemptedPeriodPrincipals;
    } else {
      json[r'cug.exempted.principals'] = null;
    }
    if (this.cugPeriodEnabled != null) {
      json[r'cug.enabled'] = this.cugPeriodEnabled;
    } else {
      json[r'cug.enabled'] = null;
    }
    if (this.cugPeriodPrincipalsPeriodRegex != null) {
      json[r'cug.principals.regex'] = this.cugPeriodPrincipalsPeriodRegex;
    } else {
      json[r'cug.principals.regex'] = null;
    }
    if (this.cugPeriodPrincipalsPeriodReplacement != null) {
      json[r'cug.principals.replacement'] = this.cugPeriodPrincipalsPeriodReplacement;
    } else {
      json[r'cug.principals.replacement'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqAuthImplCugCugSupportImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqAuthImplCugCugSupportImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqAuthImplCugCugSupportImplProperties(
        cugPeriodExemptedPeriodPrincipals: ConfigNodePropertyArray.fromJson(json[r'cug.exempted.principals']),
        cugPeriodEnabled: ConfigNodePropertyBoolean.fromJson(json[r'cug.enabled']),
        cugPeriodPrincipalsPeriodRegex: ConfigNodePropertyString.fromJson(json[r'cug.principals.regex']),
        cugPeriodPrincipalsPeriodReplacement: ConfigNodePropertyString.fromJson(json[r'cug.principals.replacement']),
      );
    }
    return null;
  }

  static List<ComDayCqAuthImplCugCugSupportImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqAuthImplCugCugSupportImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqAuthImplCugCugSupportImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqAuthImplCugCugSupportImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqAuthImplCugCugSupportImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqAuthImplCugCugSupportImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqAuthImplCugCugSupportImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqAuthImplCugCugSupportImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqAuthImplCugCugSupportImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqAuthImplCugCugSupportImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

