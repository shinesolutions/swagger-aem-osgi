//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialGroupImplGroupServiceImplProperties {
  /// Returns a new [ComAdobeCqSocialGroupImplGroupServiceImplProperties] instance.
  ComAdobeCqSocialGroupImplGroupServiceImplProperties({
    this.maxWaitTime,
    this.minWaitBetweenRetries,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? maxWaitTime;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? minWaitBetweenRetries;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialGroupImplGroupServiceImplProperties &&
    other.maxWaitTime == maxWaitTime &&
    other.minWaitBetweenRetries == minWaitBetweenRetries;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (maxWaitTime == null ? 0 : maxWaitTime!.hashCode) +
    (minWaitBetweenRetries == null ? 0 : minWaitBetweenRetries!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialGroupImplGroupServiceImplProperties[maxWaitTime=$maxWaitTime, minWaitBetweenRetries=$minWaitBetweenRetries]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.maxWaitTime != null) {
      json[r'maxWaitTime'] = this.maxWaitTime;
    } else {
      json[r'maxWaitTime'] = null;
    }
    if (this.minWaitBetweenRetries != null) {
      json[r'minWaitBetweenRetries'] = this.minWaitBetweenRetries;
    } else {
      json[r'minWaitBetweenRetries'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialGroupImplGroupServiceImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialGroupImplGroupServiceImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialGroupImplGroupServiceImplProperties(
        maxWaitTime: ConfigNodePropertyInteger.fromJson(json[r'maxWaitTime']),
        minWaitBetweenRetries: ConfigNodePropertyInteger.fromJson(json[r'minWaitBetweenRetries']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialGroupImplGroupServiceImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialGroupImplGroupServiceImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialGroupImplGroupServiceImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialGroupImplGroupServiceImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialGroupImplGroupServiceImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialGroupImplGroupServiceImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialGroupImplGroupServiceImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialGroupImplGroupServiceImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialGroupImplGroupServiceImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialGroupImplGroupServiceImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

