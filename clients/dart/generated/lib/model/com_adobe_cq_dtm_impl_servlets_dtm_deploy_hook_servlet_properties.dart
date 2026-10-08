//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqDtmImplServletsDTMDeployHookServletProperties {
  /// Returns a new [ComAdobeCqDtmImplServletsDTMDeployHookServletProperties] instance.
  ComAdobeCqDtmImplServletsDTMDeployHookServletProperties({
    this.dtmPeriodStagingPeriodIpPeriodWhitelist,
    this.dtmPeriodProductionPeriodIpPeriodWhitelist,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? dtmPeriodStagingPeriodIpPeriodWhitelist;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? dtmPeriodProductionPeriodIpPeriodWhitelist;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqDtmImplServletsDTMDeployHookServletProperties &&
    other.dtmPeriodStagingPeriodIpPeriodWhitelist == dtmPeriodStagingPeriodIpPeriodWhitelist &&
    other.dtmPeriodProductionPeriodIpPeriodWhitelist == dtmPeriodProductionPeriodIpPeriodWhitelist;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (dtmPeriodStagingPeriodIpPeriodWhitelist == null ? 0 : dtmPeriodStagingPeriodIpPeriodWhitelist!.hashCode) +
    (dtmPeriodProductionPeriodIpPeriodWhitelist == null ? 0 : dtmPeriodProductionPeriodIpPeriodWhitelist!.hashCode);

  @override
  String toString() => 'ComAdobeCqDtmImplServletsDTMDeployHookServletProperties[dtmPeriodStagingPeriodIpPeriodWhitelist=$dtmPeriodStagingPeriodIpPeriodWhitelist, dtmPeriodProductionPeriodIpPeriodWhitelist=$dtmPeriodProductionPeriodIpPeriodWhitelist]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.dtmPeriodStagingPeriodIpPeriodWhitelist != null) {
      json[r'dtm.staging.ip.whitelist'] = this.dtmPeriodStagingPeriodIpPeriodWhitelist;
    } else {
      json[r'dtm.staging.ip.whitelist'] = null;
    }
    if (this.dtmPeriodProductionPeriodIpPeriodWhitelist != null) {
      json[r'dtm.production.ip.whitelist'] = this.dtmPeriodProductionPeriodIpPeriodWhitelist;
    } else {
      json[r'dtm.production.ip.whitelist'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqDtmImplServletsDTMDeployHookServletProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqDtmImplServletsDTMDeployHookServletProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqDtmImplServletsDTMDeployHookServletProperties(
        dtmPeriodStagingPeriodIpPeriodWhitelist: ConfigNodePropertyArray.fromJson(json[r'dtm.staging.ip.whitelist']),
        dtmPeriodProductionPeriodIpPeriodWhitelist: ConfigNodePropertyArray.fromJson(json[r'dtm.production.ip.whitelist']),
      );
    }
    return null;
  }

  static List<ComAdobeCqDtmImplServletsDTMDeployHookServletProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqDtmImplServletsDTMDeployHookServletProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqDtmImplServletsDTMDeployHookServletProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqDtmImplServletsDTMDeployHookServletProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqDtmImplServletsDTMDeployHookServletProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqDtmImplServletsDTMDeployHookServletProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqDtmImplServletsDTMDeployHookServletProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqDtmImplServletsDTMDeployHookServletProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqDtmImplServletsDTMDeployHookServletProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqDtmImplServletsDTMDeployHookServletProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

