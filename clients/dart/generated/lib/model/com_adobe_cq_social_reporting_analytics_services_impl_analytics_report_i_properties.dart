//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties {
  /// Returns a new [ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties] instance.
  ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties({
    this.cqPeriodSocialPeriodReportingPeriodAnalyticsPeriodPollingPeriodImporterPeriodInterval,
    this.cqPeriodSocialPeriodReportingPeriodAnalyticsPeriodPollingPeriodImporterPeriodPageSize,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? cqPeriodSocialPeriodReportingPeriodAnalyticsPeriodPollingPeriodImporterPeriodInterval;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? cqPeriodSocialPeriodReportingPeriodAnalyticsPeriodPollingPeriodImporterPeriodPageSize;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties &&
    other.cqPeriodSocialPeriodReportingPeriodAnalyticsPeriodPollingPeriodImporterPeriodInterval == cqPeriodSocialPeriodReportingPeriodAnalyticsPeriodPollingPeriodImporterPeriodInterval &&
    other.cqPeriodSocialPeriodReportingPeriodAnalyticsPeriodPollingPeriodImporterPeriodPageSize == cqPeriodSocialPeriodReportingPeriodAnalyticsPeriodPollingPeriodImporterPeriodPageSize;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cqPeriodSocialPeriodReportingPeriodAnalyticsPeriodPollingPeriodImporterPeriodInterval == null ? 0 : cqPeriodSocialPeriodReportingPeriodAnalyticsPeriodPollingPeriodImporterPeriodInterval!.hashCode) +
    (cqPeriodSocialPeriodReportingPeriodAnalyticsPeriodPollingPeriodImporterPeriodPageSize == null ? 0 : cqPeriodSocialPeriodReportingPeriodAnalyticsPeriodPollingPeriodImporterPeriodPageSize!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties[cqPeriodSocialPeriodReportingPeriodAnalyticsPeriodPollingPeriodImporterPeriodInterval=$cqPeriodSocialPeriodReportingPeriodAnalyticsPeriodPollingPeriodImporterPeriodInterval, cqPeriodSocialPeriodReportingPeriodAnalyticsPeriodPollingPeriodImporterPeriodPageSize=$cqPeriodSocialPeriodReportingPeriodAnalyticsPeriodPollingPeriodImporterPeriodPageSize]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cqPeriodSocialPeriodReportingPeriodAnalyticsPeriodPollingPeriodImporterPeriodInterval != null) {
      json[r'cq.social.reporting.analytics.polling.importer.interval'] = this.cqPeriodSocialPeriodReportingPeriodAnalyticsPeriodPollingPeriodImporterPeriodInterval;
    } else {
      json[r'cq.social.reporting.analytics.polling.importer.interval'] = null;
    }
    if (this.cqPeriodSocialPeriodReportingPeriodAnalyticsPeriodPollingPeriodImporterPeriodPageSize != null) {
      json[r'cq.social.reporting.analytics.polling.importer.pageSize'] = this.cqPeriodSocialPeriodReportingPeriodAnalyticsPeriodPollingPeriodImporterPeriodPageSize;
    } else {
      json[r'cq.social.reporting.analytics.polling.importer.pageSize'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties(
        cqPeriodSocialPeriodReportingPeriodAnalyticsPeriodPollingPeriodImporterPeriodInterval: ConfigNodePropertyInteger.fromJson(json[r'cq.social.reporting.analytics.polling.importer.interval']),
        cqPeriodSocialPeriodReportingPeriodAnalyticsPeriodPollingPeriodImporterPeriodPageSize: ConfigNodePropertyInteger.fromJson(json[r'cq.social.reporting.analytics.polling.importer.pageSize']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

