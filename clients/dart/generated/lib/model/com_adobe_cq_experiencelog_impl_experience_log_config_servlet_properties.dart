//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties {
  /// Returns a new [ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties] instance.
  ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties({
    this.enabled,
    this.disabledForGroups,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? enabled;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? disabledForGroups;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties &&
    other.enabled == enabled &&
    other.disabledForGroups == disabledForGroups;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (enabled == null ? 0 : enabled!.hashCode) +
    (disabledForGroups == null ? 0 : disabledForGroups!.hashCode);

  @override
  String toString() => 'ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties[enabled=$enabled, disabledForGroups=$disabledForGroups]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.enabled != null) {
      json[r'enabled'] = this.enabled;
    } else {
      json[r'enabled'] = null;
    }
    if (this.disabledForGroups != null) {
      json[r'disabledForGroups'] = this.disabledForGroups;
    } else {
      json[r'disabledForGroups'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties(
        enabled: ConfigNodePropertyBoolean.fromJson(json[r'enabled']),
        disabledForGroups: ConfigNodePropertyArray.fromJson(json[r'disabledForGroups']),
      );
    }
    return null;
  }

  static List<ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

