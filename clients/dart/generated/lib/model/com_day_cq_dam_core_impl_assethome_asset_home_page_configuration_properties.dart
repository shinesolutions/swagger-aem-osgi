//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties {
  /// Returns a new [ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties] instance.
  ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties({
    this.isEnabled,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? isEnabled;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties &&
    other.isEnabled == isEnabled;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (isEnabled == null ? 0 : isEnabled!.hashCode);

  @override
  String toString() => 'ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties[isEnabled=$isEnabled]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.isEnabled != null) {
      json[r'isEnabled'] = this.isEnabled;
    } else {
      json[r'isEnabled'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties(
        isEnabled: ConfigNodePropertyBoolean.fromJson(json[r'isEnabled']),
      );
    }
    return null;
  }

  static List<ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

