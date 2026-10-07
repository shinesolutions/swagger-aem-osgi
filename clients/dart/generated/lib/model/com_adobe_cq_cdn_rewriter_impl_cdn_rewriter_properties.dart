//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqCdnRewriterImplCDNRewriterProperties {
  /// Returns a new [ComAdobeCqCdnRewriterImplCDNRewriterProperties] instance.
  ComAdobeCqCdnRewriterImplCDNRewriterProperties({
    this.servicePeriodRanking,
    this.cdnrewriterPeriodAttributes,
    this.cdnPeriodRewriterPeriodDistributionPeriodDomain,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? servicePeriodRanking;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? cdnrewriterPeriodAttributes;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? cdnPeriodRewriterPeriodDistributionPeriodDomain;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqCdnRewriterImplCDNRewriterProperties &&
    other.servicePeriodRanking == servicePeriodRanking &&
    other.cdnrewriterPeriodAttributes == cdnrewriterPeriodAttributes &&
    other.cdnPeriodRewriterPeriodDistributionPeriodDomain == cdnPeriodRewriterPeriodDistributionPeriodDomain;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (servicePeriodRanking == null ? 0 : servicePeriodRanking!.hashCode) +
    (cdnrewriterPeriodAttributes == null ? 0 : cdnrewriterPeriodAttributes!.hashCode) +
    (cdnPeriodRewriterPeriodDistributionPeriodDomain == null ? 0 : cdnPeriodRewriterPeriodDistributionPeriodDomain!.hashCode);

  @override
  String toString() => 'ComAdobeCqCdnRewriterImplCDNRewriterProperties[servicePeriodRanking=$servicePeriodRanking, cdnrewriterPeriodAttributes=$cdnrewriterPeriodAttributes, cdnPeriodRewriterPeriodDistributionPeriodDomain=$cdnPeriodRewriterPeriodDistributionPeriodDomain]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.servicePeriodRanking != null) {
      json[r'service.ranking'] = this.servicePeriodRanking;
    } else {
      json[r'service.ranking'] = null;
    }
    if (this.cdnrewriterPeriodAttributes != null) {
      json[r'cdnrewriter.attributes'] = this.cdnrewriterPeriodAttributes;
    } else {
      json[r'cdnrewriter.attributes'] = null;
    }
    if (this.cdnPeriodRewriterPeriodDistributionPeriodDomain != null) {
      json[r'cdn.rewriter.distribution.domain'] = this.cdnPeriodRewriterPeriodDistributionPeriodDomain;
    } else {
      json[r'cdn.rewriter.distribution.domain'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqCdnRewriterImplCDNRewriterProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqCdnRewriterImplCDNRewriterProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqCdnRewriterImplCDNRewriterProperties(
        servicePeriodRanking: ConfigNodePropertyInteger.fromJson(json[r'service.ranking']),
        cdnrewriterPeriodAttributes: ConfigNodePropertyArray.fromJson(json[r'cdnrewriter.attributes']),
        cdnPeriodRewriterPeriodDistributionPeriodDomain: ConfigNodePropertyString.fromJson(json[r'cdn.rewriter.distribution.domain']),
      );
    }
    return null;
  }

  static List<ComAdobeCqCdnRewriterImplCDNRewriterProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqCdnRewriterImplCDNRewriterProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqCdnRewriterImplCDNRewriterProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqCdnRewriterImplCDNRewriterProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqCdnRewriterImplCDNRewriterProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqCdnRewriterImplCDNRewriterProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqCdnRewriterImplCDNRewriterProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqCdnRewriterImplCDNRewriterProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqCdnRewriterImplCDNRewriterProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqCdnRewriterImplCDNRewriterProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

