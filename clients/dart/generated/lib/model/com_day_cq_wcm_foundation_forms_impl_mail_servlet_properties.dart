//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqWcmFoundationFormsImplMailServletProperties {
  /// Returns a new [ComDayCqWcmFoundationFormsImplMailServletProperties] instance.
  ComDayCqWcmFoundationFormsImplMailServletProperties({
    this.slingPeriodServletPeriodResourceTypes,
    this.slingPeriodServletPeriodSelectors,
    this.resourcePeriodWhitelist,
    this.resourcePeriodBlacklist,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? slingPeriodServletPeriodResourceTypes;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? slingPeriodServletPeriodSelectors;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? resourcePeriodWhitelist;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? resourcePeriodBlacklist;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqWcmFoundationFormsImplMailServletProperties &&
    other.slingPeriodServletPeriodResourceTypes == slingPeriodServletPeriodResourceTypes &&
    other.slingPeriodServletPeriodSelectors == slingPeriodServletPeriodSelectors &&
    other.resourcePeriodWhitelist == resourcePeriodWhitelist &&
    other.resourcePeriodBlacklist == resourcePeriodBlacklist;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (slingPeriodServletPeriodResourceTypes == null ? 0 : slingPeriodServletPeriodResourceTypes!.hashCode) +
    (slingPeriodServletPeriodSelectors == null ? 0 : slingPeriodServletPeriodSelectors!.hashCode) +
    (resourcePeriodWhitelist == null ? 0 : resourcePeriodWhitelist!.hashCode) +
    (resourcePeriodBlacklist == null ? 0 : resourcePeriodBlacklist!.hashCode);

  @override
  String toString() => 'ComDayCqWcmFoundationFormsImplMailServletProperties[slingPeriodServletPeriodResourceTypes=$slingPeriodServletPeriodResourceTypes, slingPeriodServletPeriodSelectors=$slingPeriodServletPeriodSelectors, resourcePeriodWhitelist=$resourcePeriodWhitelist, resourcePeriodBlacklist=$resourcePeriodBlacklist]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.slingPeriodServletPeriodResourceTypes != null) {
      json[r'sling.servlet.resourceTypes'] = this.slingPeriodServletPeriodResourceTypes;
    } else {
      json[r'sling.servlet.resourceTypes'] = null;
    }
    if (this.slingPeriodServletPeriodSelectors != null) {
      json[r'sling.servlet.selectors'] = this.slingPeriodServletPeriodSelectors;
    } else {
      json[r'sling.servlet.selectors'] = null;
    }
    if (this.resourcePeriodWhitelist != null) {
      json[r'resource.whitelist'] = this.resourcePeriodWhitelist;
    } else {
      json[r'resource.whitelist'] = null;
    }
    if (this.resourcePeriodBlacklist != null) {
      json[r'resource.blacklist'] = this.resourcePeriodBlacklist;
    } else {
      json[r'resource.blacklist'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqWcmFoundationFormsImplMailServletProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqWcmFoundationFormsImplMailServletProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqWcmFoundationFormsImplMailServletProperties(
        slingPeriodServletPeriodResourceTypes: ConfigNodePropertyString.fromJson(json[r'sling.servlet.resourceTypes']),
        slingPeriodServletPeriodSelectors: ConfigNodePropertyString.fromJson(json[r'sling.servlet.selectors']),
        resourcePeriodWhitelist: ConfigNodePropertyArray.fromJson(json[r'resource.whitelist']),
        resourcePeriodBlacklist: ConfigNodePropertyString.fromJson(json[r'resource.blacklist']),
      );
    }
    return null;
  }

  static List<ComDayCqWcmFoundationFormsImplMailServletProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqWcmFoundationFormsImplMailServletProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqWcmFoundationFormsImplMailServletProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqWcmFoundationFormsImplMailServletProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqWcmFoundationFormsImplMailServletProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqWcmFoundationFormsImplMailServletProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqWcmFoundationFormsImplMailServletProperties-objects as value to a dart map
  static Map<String, List<ComDayCqWcmFoundationFormsImplMailServletProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqWcmFoundationFormsImplMailServletProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqWcmFoundationFormsImplMailServletProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

