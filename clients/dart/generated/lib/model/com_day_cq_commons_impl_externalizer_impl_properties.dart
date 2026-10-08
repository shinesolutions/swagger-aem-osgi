//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqCommonsImplExternalizerImplProperties {
  /// Returns a new [ComDayCqCommonsImplExternalizerImplProperties] instance.
  ComDayCqCommonsImplExternalizerImplProperties({
    this.externalizerPeriodDomains,
    this.externalizerPeriodHost,
    this.externalizerPeriodContextpath,
    this.externalizerPeriodEncodedpath,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? externalizerPeriodDomains;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? externalizerPeriodHost;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? externalizerPeriodContextpath;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? externalizerPeriodEncodedpath;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqCommonsImplExternalizerImplProperties &&
    other.externalizerPeriodDomains == externalizerPeriodDomains &&
    other.externalizerPeriodHost == externalizerPeriodHost &&
    other.externalizerPeriodContextpath == externalizerPeriodContextpath &&
    other.externalizerPeriodEncodedpath == externalizerPeriodEncodedpath;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (externalizerPeriodDomains == null ? 0 : externalizerPeriodDomains!.hashCode) +
    (externalizerPeriodHost == null ? 0 : externalizerPeriodHost!.hashCode) +
    (externalizerPeriodContextpath == null ? 0 : externalizerPeriodContextpath!.hashCode) +
    (externalizerPeriodEncodedpath == null ? 0 : externalizerPeriodEncodedpath!.hashCode);

  @override
  String toString() => 'ComDayCqCommonsImplExternalizerImplProperties[externalizerPeriodDomains=$externalizerPeriodDomains, externalizerPeriodHost=$externalizerPeriodHost, externalizerPeriodContextpath=$externalizerPeriodContextpath, externalizerPeriodEncodedpath=$externalizerPeriodEncodedpath]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.externalizerPeriodDomains != null) {
      json[r'externalizer.domains'] = this.externalizerPeriodDomains;
    } else {
      json[r'externalizer.domains'] = null;
    }
    if (this.externalizerPeriodHost != null) {
      json[r'externalizer.host'] = this.externalizerPeriodHost;
    } else {
      json[r'externalizer.host'] = null;
    }
    if (this.externalizerPeriodContextpath != null) {
      json[r'externalizer.contextpath'] = this.externalizerPeriodContextpath;
    } else {
      json[r'externalizer.contextpath'] = null;
    }
    if (this.externalizerPeriodEncodedpath != null) {
      json[r'externalizer.encodedpath'] = this.externalizerPeriodEncodedpath;
    } else {
      json[r'externalizer.encodedpath'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqCommonsImplExternalizerImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqCommonsImplExternalizerImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqCommonsImplExternalizerImplProperties(
        externalizerPeriodDomains: ConfigNodePropertyArray.fromJson(json[r'externalizer.domains']),
        externalizerPeriodHost: ConfigNodePropertyString.fromJson(json[r'externalizer.host']),
        externalizerPeriodContextpath: ConfigNodePropertyString.fromJson(json[r'externalizer.contextpath']),
        externalizerPeriodEncodedpath: ConfigNodePropertyBoolean.fromJson(json[r'externalizer.encodedpath']),
      );
    }
    return null;
  }

  static List<ComDayCqCommonsImplExternalizerImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqCommonsImplExternalizerImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqCommonsImplExternalizerImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqCommonsImplExternalizerImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqCommonsImplExternalizerImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqCommonsImplExternalizerImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqCommonsImplExternalizerImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqCommonsImplExternalizerImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqCommonsImplExternalizerImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqCommonsImplExternalizerImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

