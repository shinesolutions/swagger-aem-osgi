//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialUserImplTransportHttpToPublisherProperties {
  /// Returns a new [ComAdobeCqSocialUserImplTransportHttpToPublisherProperties] instance.
  ComAdobeCqSocialUserImplTransportHttpToPublisherProperties({
    this.enable,
    this.agentPeriodConfiguration,
    this.contextPeriodPath,
    this.disabledPeriodCipherPeriodSuites,
    this.enabledPeriodCipherPeriodSuites,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? enable;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? agentPeriodConfiguration;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? contextPeriodPath;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? disabledPeriodCipherPeriodSuites;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? enabledPeriodCipherPeriodSuites;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialUserImplTransportHttpToPublisherProperties &&
    other.enable == enable &&
    other.agentPeriodConfiguration == agentPeriodConfiguration &&
    other.contextPeriodPath == contextPeriodPath &&
    other.disabledPeriodCipherPeriodSuites == disabledPeriodCipherPeriodSuites &&
    other.enabledPeriodCipherPeriodSuites == enabledPeriodCipherPeriodSuites;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (enable == null ? 0 : enable!.hashCode) +
    (agentPeriodConfiguration == null ? 0 : agentPeriodConfiguration!.hashCode) +
    (contextPeriodPath == null ? 0 : contextPeriodPath!.hashCode) +
    (disabledPeriodCipherPeriodSuites == null ? 0 : disabledPeriodCipherPeriodSuites!.hashCode) +
    (enabledPeriodCipherPeriodSuites == null ? 0 : enabledPeriodCipherPeriodSuites!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialUserImplTransportHttpToPublisherProperties[enable=$enable, agentPeriodConfiguration=$agentPeriodConfiguration, contextPeriodPath=$contextPeriodPath, disabledPeriodCipherPeriodSuites=$disabledPeriodCipherPeriodSuites, enabledPeriodCipherPeriodSuites=$enabledPeriodCipherPeriodSuites]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.enable != null) {
      json[r'enable'] = this.enable;
    } else {
      json[r'enable'] = null;
    }
    if (this.agentPeriodConfiguration != null) {
      json[r'agent.configuration'] = this.agentPeriodConfiguration;
    } else {
      json[r'agent.configuration'] = null;
    }
    if (this.contextPeriodPath != null) {
      json[r'context.path'] = this.contextPeriodPath;
    } else {
      json[r'context.path'] = null;
    }
    if (this.disabledPeriodCipherPeriodSuites != null) {
      json[r'disabled.cipher.suites'] = this.disabledPeriodCipherPeriodSuites;
    } else {
      json[r'disabled.cipher.suites'] = null;
    }
    if (this.enabledPeriodCipherPeriodSuites != null) {
      json[r'enabled.cipher.suites'] = this.enabledPeriodCipherPeriodSuites;
    } else {
      json[r'enabled.cipher.suites'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialUserImplTransportHttpToPublisherProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialUserImplTransportHttpToPublisherProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialUserImplTransportHttpToPublisherProperties(
        enable: ConfigNodePropertyBoolean.fromJson(json[r'enable']),
        agentPeriodConfiguration: ConfigNodePropertyArray.fromJson(json[r'agent.configuration']),
        contextPeriodPath: ConfigNodePropertyString.fromJson(json[r'context.path']),
        disabledPeriodCipherPeriodSuites: ConfigNodePropertyArray.fromJson(json[r'disabled.cipher.suites']),
        enabledPeriodCipherPeriodSuites: ConfigNodePropertyArray.fromJson(json[r'enabled.cipher.suites']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialUserImplTransportHttpToPublisherProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialUserImplTransportHttpToPublisherProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialUserImplTransportHttpToPublisherProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialUserImplTransportHttpToPublisherProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialUserImplTransportHttpToPublisherProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialUserImplTransportHttpToPublisherProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialUserImplTransportHttpToPublisherProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

