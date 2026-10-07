//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties {
  /// Returns a new [ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties] instance.
  ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties({
    this.redirectPeriodEnabled,
    this.redirectPeriodStatsPeriodEnabled,
    this.redirectPeriodExtensions,
    this.redirectPeriodPaths,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? redirectPeriodEnabled;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? redirectPeriodStatsPeriodEnabled;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? redirectPeriodExtensions;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? redirectPeriodPaths;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties &&
    other.redirectPeriodEnabled == redirectPeriodEnabled &&
    other.redirectPeriodStatsPeriodEnabled == redirectPeriodStatsPeriodEnabled &&
    other.redirectPeriodExtensions == redirectPeriodExtensions &&
    other.redirectPeriodPaths == redirectPeriodPaths;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (redirectPeriodEnabled == null ? 0 : redirectPeriodEnabled!.hashCode) +
    (redirectPeriodStatsPeriodEnabled == null ? 0 : redirectPeriodStatsPeriodEnabled!.hashCode) +
    (redirectPeriodExtensions == null ? 0 : redirectPeriodExtensions!.hashCode) +
    (redirectPeriodPaths == null ? 0 : redirectPeriodPaths!.hashCode);

  @override
  String toString() => 'ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties[redirectPeriodEnabled=$redirectPeriodEnabled, redirectPeriodStatsPeriodEnabled=$redirectPeriodStatsPeriodEnabled, redirectPeriodExtensions=$redirectPeriodExtensions, redirectPeriodPaths=$redirectPeriodPaths]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.redirectPeriodEnabled != null) {
      json[r'redirect.enabled'] = this.redirectPeriodEnabled;
    } else {
      json[r'redirect.enabled'] = null;
    }
    if (this.redirectPeriodStatsPeriodEnabled != null) {
      json[r'redirect.stats.enabled'] = this.redirectPeriodStatsPeriodEnabled;
    } else {
      json[r'redirect.stats.enabled'] = null;
    }
    if (this.redirectPeriodExtensions != null) {
      json[r'redirect.extensions'] = this.redirectPeriodExtensions;
    } else {
      json[r'redirect.extensions'] = null;
    }
    if (this.redirectPeriodPaths != null) {
      json[r'redirect.paths'] = this.redirectPeriodPaths;
    } else {
      json[r'redirect.paths'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties(
        redirectPeriodEnabled: ConfigNodePropertyBoolean.fromJson(json[r'redirect.enabled']),
        redirectPeriodStatsPeriodEnabled: ConfigNodePropertyBoolean.fromJson(json[r'redirect.stats.enabled']),
        redirectPeriodExtensions: ConfigNodePropertyArray.fromJson(json[r'redirect.extensions']),
        redirectPeriodPaths: ConfigNodePropertyArray.fromJson(json[r'redirect.paths']),
      );
    }
    return null;
  }

  static List<ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties-objects as value to a dart map
  static Map<String, List<ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

