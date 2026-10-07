//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties {
  /// Returns a new [ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties] instance.
  ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties({
    this.cdnPeriodConfigPeriodDistributionPeriodDomain,
    this.cdnPeriodConfigPeriodEnablePeriodRewriting,
    this.cdnPeriodConfigPeriodPathPeriodPrefixes,
    this.cdnPeriodConfigPeriodCdnttl,
    this.cdnPeriodConfigPeriodApplicationPeriodProtocol,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? cdnPeriodConfigPeriodDistributionPeriodDomain;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? cdnPeriodConfigPeriodEnablePeriodRewriting;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? cdnPeriodConfigPeriodPathPeriodPrefixes;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? cdnPeriodConfigPeriodCdnttl;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? cdnPeriodConfigPeriodApplicationPeriodProtocol;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties &&
    other.cdnPeriodConfigPeriodDistributionPeriodDomain == cdnPeriodConfigPeriodDistributionPeriodDomain &&
    other.cdnPeriodConfigPeriodEnablePeriodRewriting == cdnPeriodConfigPeriodEnablePeriodRewriting &&
    other.cdnPeriodConfigPeriodPathPeriodPrefixes == cdnPeriodConfigPeriodPathPeriodPrefixes &&
    other.cdnPeriodConfigPeriodCdnttl == cdnPeriodConfigPeriodCdnttl &&
    other.cdnPeriodConfigPeriodApplicationPeriodProtocol == cdnPeriodConfigPeriodApplicationPeriodProtocol;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cdnPeriodConfigPeriodDistributionPeriodDomain == null ? 0 : cdnPeriodConfigPeriodDistributionPeriodDomain!.hashCode) +
    (cdnPeriodConfigPeriodEnablePeriodRewriting == null ? 0 : cdnPeriodConfigPeriodEnablePeriodRewriting!.hashCode) +
    (cdnPeriodConfigPeriodPathPeriodPrefixes == null ? 0 : cdnPeriodConfigPeriodPathPeriodPrefixes!.hashCode) +
    (cdnPeriodConfigPeriodCdnttl == null ? 0 : cdnPeriodConfigPeriodCdnttl!.hashCode) +
    (cdnPeriodConfigPeriodApplicationPeriodProtocol == null ? 0 : cdnPeriodConfigPeriodApplicationPeriodProtocol!.hashCode);

  @override
  String toString() => 'ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties[cdnPeriodConfigPeriodDistributionPeriodDomain=$cdnPeriodConfigPeriodDistributionPeriodDomain, cdnPeriodConfigPeriodEnablePeriodRewriting=$cdnPeriodConfigPeriodEnablePeriodRewriting, cdnPeriodConfigPeriodPathPeriodPrefixes=$cdnPeriodConfigPeriodPathPeriodPrefixes, cdnPeriodConfigPeriodCdnttl=$cdnPeriodConfigPeriodCdnttl, cdnPeriodConfigPeriodApplicationPeriodProtocol=$cdnPeriodConfigPeriodApplicationPeriodProtocol]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cdnPeriodConfigPeriodDistributionPeriodDomain != null) {
      json[r'cdn.config.distribution.domain'] = this.cdnPeriodConfigPeriodDistributionPeriodDomain;
    } else {
      json[r'cdn.config.distribution.domain'] = null;
    }
    if (this.cdnPeriodConfigPeriodEnablePeriodRewriting != null) {
      json[r'cdn.config.enable.rewriting'] = this.cdnPeriodConfigPeriodEnablePeriodRewriting;
    } else {
      json[r'cdn.config.enable.rewriting'] = null;
    }
    if (this.cdnPeriodConfigPeriodPathPeriodPrefixes != null) {
      json[r'cdn.config.path.prefixes'] = this.cdnPeriodConfigPeriodPathPeriodPrefixes;
    } else {
      json[r'cdn.config.path.prefixes'] = null;
    }
    if (this.cdnPeriodConfigPeriodCdnttl != null) {
      json[r'cdn.config.cdnttl'] = this.cdnPeriodConfigPeriodCdnttl;
    } else {
      json[r'cdn.config.cdnttl'] = null;
    }
    if (this.cdnPeriodConfigPeriodApplicationPeriodProtocol != null) {
      json[r'cdn.config.application.protocol'] = this.cdnPeriodConfigPeriodApplicationPeriodProtocol;
    } else {
      json[r'cdn.config.application.protocol'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties(
        cdnPeriodConfigPeriodDistributionPeriodDomain: ConfigNodePropertyString.fromJson(json[r'cdn.config.distribution.domain']),
        cdnPeriodConfigPeriodEnablePeriodRewriting: ConfigNodePropertyBoolean.fromJson(json[r'cdn.config.enable.rewriting']),
        cdnPeriodConfigPeriodPathPeriodPrefixes: ConfigNodePropertyArray.fromJson(json[r'cdn.config.path.prefixes']),
        cdnPeriodConfigPeriodCdnttl: ConfigNodePropertyInteger.fromJson(json[r'cdn.config.cdnttl']),
        cdnPeriodConfigPeriodApplicationPeriodProtocol: ConfigNodePropertyString.fromJson(json[r'cdn.config.application.protocol']),
      );
    }
    return null;
  }

  static List<ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

