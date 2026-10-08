//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties {
  /// Returns a new [ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties] instance.
  ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties({
    this.schedulerPeriodPeriod,
    this.schedulerPeriodConcurrent,
    this.servicePeriodBadLinkToleranceInterval,
    this.servicePeriodCheckOverridePatterns,
    this.servicePeriodCacheBrokenInternalLinks,
    this.servicePeriodSpecialLinkPrefix,
    this.servicePeriodSpecialLinkPatterns,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? schedulerPeriodPeriod;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? schedulerPeriodConcurrent;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? servicePeriodBadLinkToleranceInterval;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? servicePeriodCheckOverridePatterns;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? servicePeriodCacheBrokenInternalLinks;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? servicePeriodSpecialLinkPrefix;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? servicePeriodSpecialLinkPatterns;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties &&
    other.schedulerPeriodPeriod == schedulerPeriodPeriod &&
    other.schedulerPeriodConcurrent == schedulerPeriodConcurrent &&
    other.servicePeriodBadLinkToleranceInterval == servicePeriodBadLinkToleranceInterval &&
    other.servicePeriodCheckOverridePatterns == servicePeriodCheckOverridePatterns &&
    other.servicePeriodCacheBrokenInternalLinks == servicePeriodCacheBrokenInternalLinks &&
    other.servicePeriodSpecialLinkPrefix == servicePeriodSpecialLinkPrefix &&
    other.servicePeriodSpecialLinkPatterns == servicePeriodSpecialLinkPatterns;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (schedulerPeriodPeriod == null ? 0 : schedulerPeriodPeriod!.hashCode) +
    (schedulerPeriodConcurrent == null ? 0 : schedulerPeriodConcurrent!.hashCode) +
    (servicePeriodBadLinkToleranceInterval == null ? 0 : servicePeriodBadLinkToleranceInterval!.hashCode) +
    (servicePeriodCheckOverridePatterns == null ? 0 : servicePeriodCheckOverridePatterns!.hashCode) +
    (servicePeriodCacheBrokenInternalLinks == null ? 0 : servicePeriodCacheBrokenInternalLinks!.hashCode) +
    (servicePeriodSpecialLinkPrefix == null ? 0 : servicePeriodSpecialLinkPrefix!.hashCode) +
    (servicePeriodSpecialLinkPatterns == null ? 0 : servicePeriodSpecialLinkPatterns!.hashCode);

  @override
  String toString() => 'ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties[schedulerPeriodPeriod=$schedulerPeriodPeriod, schedulerPeriodConcurrent=$schedulerPeriodConcurrent, servicePeriodBadLinkToleranceInterval=$servicePeriodBadLinkToleranceInterval, servicePeriodCheckOverridePatterns=$servicePeriodCheckOverridePatterns, servicePeriodCacheBrokenInternalLinks=$servicePeriodCacheBrokenInternalLinks, servicePeriodSpecialLinkPrefix=$servicePeriodSpecialLinkPrefix, servicePeriodSpecialLinkPatterns=$servicePeriodSpecialLinkPatterns]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.schedulerPeriodPeriod != null) {
      json[r'scheduler.period'] = this.schedulerPeriodPeriod;
    } else {
      json[r'scheduler.period'] = null;
    }
    if (this.schedulerPeriodConcurrent != null) {
      json[r'scheduler.concurrent'] = this.schedulerPeriodConcurrent;
    } else {
      json[r'scheduler.concurrent'] = null;
    }
    if (this.servicePeriodBadLinkToleranceInterval != null) {
      json[r'service.bad_link_tolerance_interval'] = this.servicePeriodBadLinkToleranceInterval;
    } else {
      json[r'service.bad_link_tolerance_interval'] = null;
    }
    if (this.servicePeriodCheckOverridePatterns != null) {
      json[r'service.check_override_patterns'] = this.servicePeriodCheckOverridePatterns;
    } else {
      json[r'service.check_override_patterns'] = null;
    }
    if (this.servicePeriodCacheBrokenInternalLinks != null) {
      json[r'service.cache_broken_internal_links'] = this.servicePeriodCacheBrokenInternalLinks;
    } else {
      json[r'service.cache_broken_internal_links'] = null;
    }
    if (this.servicePeriodSpecialLinkPrefix != null) {
      json[r'service.special_link_prefix'] = this.servicePeriodSpecialLinkPrefix;
    } else {
      json[r'service.special_link_prefix'] = null;
    }
    if (this.servicePeriodSpecialLinkPatterns != null) {
      json[r'service.special_link_patterns'] = this.servicePeriodSpecialLinkPatterns;
    } else {
      json[r'service.special_link_patterns'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties(
        schedulerPeriodPeriod: ConfigNodePropertyInteger.fromJson(json[r'scheduler.period']),
        schedulerPeriodConcurrent: ConfigNodePropertyBoolean.fromJson(json[r'scheduler.concurrent']),
        servicePeriodBadLinkToleranceInterval: ConfigNodePropertyInteger.fromJson(json[r'service.bad_link_tolerance_interval']),
        servicePeriodCheckOverridePatterns: ConfigNodePropertyArray.fromJson(json[r'service.check_override_patterns']),
        servicePeriodCacheBrokenInternalLinks: ConfigNodePropertyBoolean.fromJson(json[r'service.cache_broken_internal_links']),
        servicePeriodSpecialLinkPrefix: ConfigNodePropertyArray.fromJson(json[r'service.special_link_prefix']),
        servicePeriodSpecialLinkPatterns: ConfigNodePropertyArray.fromJson(json[r'service.special_link_patterns']),
      );
    }
    return null;
  }

  static List<ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

