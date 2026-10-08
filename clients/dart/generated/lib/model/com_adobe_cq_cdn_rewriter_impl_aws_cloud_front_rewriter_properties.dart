//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties {
  /// Returns a new [ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties] instance.
  ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties({
    this.servicePeriodRanking,
    this.keypairPeriodId,
    this.keypairPeriodAlias,
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
  ConfigNodePropertyString? keypairPeriodId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? keypairPeriodAlias;

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
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties &&
    other.servicePeriodRanking == servicePeriodRanking &&
    other.keypairPeriodId == keypairPeriodId &&
    other.keypairPeriodAlias == keypairPeriodAlias &&
    other.cdnrewriterPeriodAttributes == cdnrewriterPeriodAttributes &&
    other.cdnPeriodRewriterPeriodDistributionPeriodDomain == cdnPeriodRewriterPeriodDistributionPeriodDomain;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (servicePeriodRanking == null ? 0 : servicePeriodRanking!.hashCode) +
    (keypairPeriodId == null ? 0 : keypairPeriodId!.hashCode) +
    (keypairPeriodAlias == null ? 0 : keypairPeriodAlias!.hashCode) +
    (cdnrewriterPeriodAttributes == null ? 0 : cdnrewriterPeriodAttributes!.hashCode) +
    (cdnPeriodRewriterPeriodDistributionPeriodDomain == null ? 0 : cdnPeriodRewriterPeriodDistributionPeriodDomain!.hashCode);

  @override
  String toString() => 'ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties[servicePeriodRanking=$servicePeriodRanking, keypairPeriodId=$keypairPeriodId, keypairPeriodAlias=$keypairPeriodAlias, cdnrewriterPeriodAttributes=$cdnrewriterPeriodAttributes, cdnPeriodRewriterPeriodDistributionPeriodDomain=$cdnPeriodRewriterPeriodDistributionPeriodDomain]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.servicePeriodRanking != null) {
      json[r'service.ranking'] = this.servicePeriodRanking;
    } else {
      json[r'service.ranking'] = null;
    }
    if (this.keypairPeriodId != null) {
      json[r'keypair.id'] = this.keypairPeriodId;
    } else {
      json[r'keypair.id'] = null;
    }
    if (this.keypairPeriodAlias != null) {
      json[r'keypair.alias'] = this.keypairPeriodAlias;
    } else {
      json[r'keypair.alias'] = null;
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

  /// Returns a new [ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties(
        servicePeriodRanking: ConfigNodePropertyInteger.fromJson(json[r'service.ranking']),
        keypairPeriodId: ConfigNodePropertyString.fromJson(json[r'keypair.id']),
        keypairPeriodAlias: ConfigNodePropertyString.fromJson(json[r'keypair.alias']),
        cdnrewriterPeriodAttributes: ConfigNodePropertyArray.fromJson(json[r'cdnrewriter.attributes']),
        cdnPeriodRewriterPeriodDistributionPeriodDomain: ConfigNodePropertyString.fromJson(json[r'cdn.rewriter.distribution.domain']),
      );
    }
    return null;
  }

  static List<ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

