//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties {
  /// Returns a new [ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties] instance.
  ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties({
    this.slingPeriodServletPeriodSelectors,
    this.slingPeriodServletPeriodExtensions,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? slingPeriodServletPeriodSelectors;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? slingPeriodServletPeriodExtensions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties &&
    other.slingPeriodServletPeriodSelectors == slingPeriodServletPeriodSelectors &&
    other.slingPeriodServletPeriodExtensions == slingPeriodServletPeriodExtensions;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (slingPeriodServletPeriodSelectors == null ? 0 : slingPeriodServletPeriodSelectors!.hashCode) +
    (slingPeriodServletPeriodExtensions == null ? 0 : slingPeriodServletPeriodExtensions!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties[slingPeriodServletPeriodSelectors=$slingPeriodServletPeriodSelectors, slingPeriodServletPeriodExtensions=$slingPeriodServletPeriodExtensions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.slingPeriodServletPeriodSelectors != null) {
      json[r'sling.servlet.selectors'] = this.slingPeriodServletPeriodSelectors;
    } else {
      json[r'sling.servlet.selectors'] = null;
    }
    if (this.slingPeriodServletPeriodExtensions != null) {
      json[r'sling.servlet.extensions'] = this.slingPeriodServletPeriodExtensions;
    } else {
      json[r'sling.servlet.extensions'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties(
        slingPeriodServletPeriodSelectors: ConfigNodePropertyArray.fromJson(json[r'sling.servlet.selectors']),
        slingPeriodServletPeriodExtensions: ConfigNodePropertyString.fromJson(json[r'sling.servlet.extensions']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

