//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties {
  /// Returns a new [ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties] instance.
  ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties({
    this.componentsUsingTags,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? componentsUsingTags;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties &&
    other.componentsUsingTags == componentsUsingTags;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (componentsUsingTags == null ? 0 : componentsUsingTags!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties[componentsUsingTags=$componentsUsingTags]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.componentsUsingTags != null) {
      json[r'componentsUsingTags'] = this.componentsUsingTags;
    } else {
      json[r'componentsUsingTags'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties(
        componentsUsingTags: ConfigNodePropertyArray.fromJson(json[r'componentsUsingTags']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

