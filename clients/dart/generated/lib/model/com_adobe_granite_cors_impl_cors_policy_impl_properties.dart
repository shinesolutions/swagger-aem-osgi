//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteCorsImplCORSPolicyImplProperties {
  /// Returns a new [ComAdobeGraniteCorsImplCORSPolicyImplProperties] instance.
  ComAdobeGraniteCorsImplCORSPolicyImplProperties({
    this.alloworigin,
    this.alloworiginregexp,
    this.allowedpaths,
    this.exposedheaders,
    this.maxage,
    this.supportedheaders,
    this.supportedmethods,
    this.supportscredentials,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? alloworigin;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? alloworiginregexp;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? allowedpaths;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? exposedheaders;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? maxage;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? supportedheaders;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? supportedmethods;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? supportscredentials;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteCorsImplCORSPolicyImplProperties &&
    other.alloworigin == alloworigin &&
    other.alloworiginregexp == alloworiginregexp &&
    other.allowedpaths == allowedpaths &&
    other.exposedheaders == exposedheaders &&
    other.maxage == maxage &&
    other.supportedheaders == supportedheaders &&
    other.supportedmethods == supportedmethods &&
    other.supportscredentials == supportscredentials;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (alloworigin == null ? 0 : alloworigin!.hashCode) +
    (alloworiginregexp == null ? 0 : alloworiginregexp!.hashCode) +
    (allowedpaths == null ? 0 : allowedpaths!.hashCode) +
    (exposedheaders == null ? 0 : exposedheaders!.hashCode) +
    (maxage == null ? 0 : maxage!.hashCode) +
    (supportedheaders == null ? 0 : supportedheaders!.hashCode) +
    (supportedmethods == null ? 0 : supportedmethods!.hashCode) +
    (supportscredentials == null ? 0 : supportscredentials!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteCorsImplCORSPolicyImplProperties[alloworigin=$alloworigin, alloworiginregexp=$alloworiginregexp, allowedpaths=$allowedpaths, exposedheaders=$exposedheaders, maxage=$maxage, supportedheaders=$supportedheaders, supportedmethods=$supportedmethods, supportscredentials=$supportscredentials]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.alloworigin != null) {
      json[r'alloworigin'] = this.alloworigin;
    } else {
      json[r'alloworigin'] = null;
    }
    if (this.alloworiginregexp != null) {
      json[r'alloworiginregexp'] = this.alloworiginregexp;
    } else {
      json[r'alloworiginregexp'] = null;
    }
    if (this.allowedpaths != null) {
      json[r'allowedpaths'] = this.allowedpaths;
    } else {
      json[r'allowedpaths'] = null;
    }
    if (this.exposedheaders != null) {
      json[r'exposedheaders'] = this.exposedheaders;
    } else {
      json[r'exposedheaders'] = null;
    }
    if (this.maxage != null) {
      json[r'maxage'] = this.maxage;
    } else {
      json[r'maxage'] = null;
    }
    if (this.supportedheaders != null) {
      json[r'supportedheaders'] = this.supportedheaders;
    } else {
      json[r'supportedheaders'] = null;
    }
    if (this.supportedmethods != null) {
      json[r'supportedmethods'] = this.supportedmethods;
    } else {
      json[r'supportedmethods'] = null;
    }
    if (this.supportscredentials != null) {
      json[r'supportscredentials'] = this.supportscredentials;
    } else {
      json[r'supportscredentials'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteCorsImplCORSPolicyImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteCorsImplCORSPolicyImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteCorsImplCORSPolicyImplProperties(
        alloworigin: ConfigNodePropertyArray.fromJson(json[r'alloworigin']),
        alloworiginregexp: ConfigNodePropertyArray.fromJson(json[r'alloworiginregexp']),
        allowedpaths: ConfigNodePropertyArray.fromJson(json[r'allowedpaths']),
        exposedheaders: ConfigNodePropertyArray.fromJson(json[r'exposedheaders']),
        maxage: ConfigNodePropertyInteger.fromJson(json[r'maxage']),
        supportedheaders: ConfigNodePropertyArray.fromJson(json[r'supportedheaders']),
        supportedmethods: ConfigNodePropertyArray.fromJson(json[r'supportedmethods']),
        supportscredentials: ConfigNodePropertyBoolean.fromJson(json[r'supportscredentials']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteCorsImplCORSPolicyImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteCorsImplCORSPolicyImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteCorsImplCORSPolicyImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteCorsImplCORSPolicyImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteCorsImplCORSPolicyImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteCorsImplCORSPolicyImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteCorsImplCORSPolicyImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteCorsImplCORSPolicyImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteCorsImplCORSPolicyImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteCorsImplCORSPolicyImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

