//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqMcmImplMCMConfigurationProperties {
  /// Returns a new [ComDayCqMcmImplMCMConfigurationProperties] instance.
  ComDayCqMcmImplMCMConfigurationProperties({
    this.experiencePeriodIndirection,
    this.touchpointPeriodIndirection,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? experiencePeriodIndirection;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? touchpointPeriodIndirection;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqMcmImplMCMConfigurationProperties &&
    other.experiencePeriodIndirection == experiencePeriodIndirection &&
    other.touchpointPeriodIndirection == touchpointPeriodIndirection;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (experiencePeriodIndirection == null ? 0 : experiencePeriodIndirection!.hashCode) +
    (touchpointPeriodIndirection == null ? 0 : touchpointPeriodIndirection!.hashCode);

  @override
  String toString() => 'ComDayCqMcmImplMCMConfigurationProperties[experiencePeriodIndirection=$experiencePeriodIndirection, touchpointPeriodIndirection=$touchpointPeriodIndirection]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.experiencePeriodIndirection != null) {
      json[r'experience.indirection'] = this.experiencePeriodIndirection;
    } else {
      json[r'experience.indirection'] = null;
    }
    if (this.touchpointPeriodIndirection != null) {
      json[r'touchpoint.indirection'] = this.touchpointPeriodIndirection;
    } else {
      json[r'touchpoint.indirection'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqMcmImplMCMConfigurationProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqMcmImplMCMConfigurationProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqMcmImplMCMConfigurationProperties(
        experiencePeriodIndirection: ConfigNodePropertyArray.fromJson(json[r'experience.indirection']),
        touchpointPeriodIndirection: ConfigNodePropertyArray.fromJson(json[r'touchpoint.indirection']),
      );
    }
    return null;
  }

  static List<ComDayCqMcmImplMCMConfigurationProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqMcmImplMCMConfigurationProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqMcmImplMCMConfigurationProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqMcmImplMCMConfigurationProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqMcmImplMCMConfigurationProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqMcmImplMCMConfigurationProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqMcmImplMCMConfigurationProperties-objects as value to a dart map
  static Map<String, List<ComDayCqMcmImplMCMConfigurationProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqMcmImplMCMConfigurationProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqMcmImplMCMConfigurationProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

