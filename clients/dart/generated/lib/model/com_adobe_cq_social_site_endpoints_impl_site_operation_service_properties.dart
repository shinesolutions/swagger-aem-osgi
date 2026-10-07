//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties {
  /// Returns a new [ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties] instance.
  ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties({
    this.fieldWhitelist,
    this.sitePathFilters,
    this.sitePackageGroup,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? fieldWhitelist;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? sitePathFilters;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? sitePackageGroup;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties &&
    other.fieldWhitelist == fieldWhitelist &&
    other.sitePathFilters == sitePathFilters &&
    other.sitePackageGroup == sitePackageGroup;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (fieldWhitelist == null ? 0 : fieldWhitelist!.hashCode) +
    (sitePathFilters == null ? 0 : sitePathFilters!.hashCode) +
    (sitePackageGroup == null ? 0 : sitePackageGroup!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties[fieldWhitelist=$fieldWhitelist, sitePathFilters=$sitePathFilters, sitePackageGroup=$sitePackageGroup]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.fieldWhitelist != null) {
      json[r'fieldWhitelist'] = this.fieldWhitelist;
    } else {
      json[r'fieldWhitelist'] = null;
    }
    if (this.sitePathFilters != null) {
      json[r'sitePathFilters'] = this.sitePathFilters;
    } else {
      json[r'sitePathFilters'] = null;
    }
    if (this.sitePackageGroup != null) {
      json[r'sitePackageGroup'] = this.sitePackageGroup;
    } else {
      json[r'sitePackageGroup'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties(
        fieldWhitelist: ConfigNodePropertyArray.fromJson(json[r'fieldWhitelist']),
        sitePathFilters: ConfigNodePropertyArray.fromJson(json[r'sitePathFilters']),
        sitePackageGroup: ConfigNodePropertyString.fromJson(json[r'sitePackageGroup']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

