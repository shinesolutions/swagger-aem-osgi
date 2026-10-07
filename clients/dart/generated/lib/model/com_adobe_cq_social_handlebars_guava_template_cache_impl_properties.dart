//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties {
  /// Returns a new [ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties] instance.
  ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties({
    this.parameterPeriodGuavaPeriodCachePeriodEnabled,
    this.parameterPeriodGuavaPeriodCachePeriodParams,
    this.parameterPeriodGuavaPeriodCachePeriodReload,
    this.servicePeriodRanking,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? parameterPeriodGuavaPeriodCachePeriodEnabled;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? parameterPeriodGuavaPeriodCachePeriodParams;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? parameterPeriodGuavaPeriodCachePeriodReload;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? servicePeriodRanking;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties &&
    other.parameterPeriodGuavaPeriodCachePeriodEnabled == parameterPeriodGuavaPeriodCachePeriodEnabled &&
    other.parameterPeriodGuavaPeriodCachePeriodParams == parameterPeriodGuavaPeriodCachePeriodParams &&
    other.parameterPeriodGuavaPeriodCachePeriodReload == parameterPeriodGuavaPeriodCachePeriodReload &&
    other.servicePeriodRanking == servicePeriodRanking;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (parameterPeriodGuavaPeriodCachePeriodEnabled == null ? 0 : parameterPeriodGuavaPeriodCachePeriodEnabled!.hashCode) +
    (parameterPeriodGuavaPeriodCachePeriodParams == null ? 0 : parameterPeriodGuavaPeriodCachePeriodParams!.hashCode) +
    (parameterPeriodGuavaPeriodCachePeriodReload == null ? 0 : parameterPeriodGuavaPeriodCachePeriodReload!.hashCode) +
    (servicePeriodRanking == null ? 0 : servicePeriodRanking!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties[parameterPeriodGuavaPeriodCachePeriodEnabled=$parameterPeriodGuavaPeriodCachePeriodEnabled, parameterPeriodGuavaPeriodCachePeriodParams=$parameterPeriodGuavaPeriodCachePeriodParams, parameterPeriodGuavaPeriodCachePeriodReload=$parameterPeriodGuavaPeriodCachePeriodReload, servicePeriodRanking=$servicePeriodRanking]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.parameterPeriodGuavaPeriodCachePeriodEnabled != null) {
      json[r'parameter.guava.cache.enabled'] = this.parameterPeriodGuavaPeriodCachePeriodEnabled;
    } else {
      json[r'parameter.guava.cache.enabled'] = null;
    }
    if (this.parameterPeriodGuavaPeriodCachePeriodParams != null) {
      json[r'parameter.guava.cache.params'] = this.parameterPeriodGuavaPeriodCachePeriodParams;
    } else {
      json[r'parameter.guava.cache.params'] = null;
    }
    if (this.parameterPeriodGuavaPeriodCachePeriodReload != null) {
      json[r'parameter.guava.cache.reload'] = this.parameterPeriodGuavaPeriodCachePeriodReload;
    } else {
      json[r'parameter.guava.cache.reload'] = null;
    }
    if (this.servicePeriodRanking != null) {
      json[r'service.ranking'] = this.servicePeriodRanking;
    } else {
      json[r'service.ranking'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties(
        parameterPeriodGuavaPeriodCachePeriodEnabled: ConfigNodePropertyBoolean.fromJson(json[r'parameter.guava.cache.enabled']),
        parameterPeriodGuavaPeriodCachePeriodParams: ConfigNodePropertyString.fromJson(json[r'parameter.guava.cache.params']),
        parameterPeriodGuavaPeriodCachePeriodReload: ConfigNodePropertyBoolean.fromJson(json[r'parameter.guava.cache.reload']),
        servicePeriodRanking: ConfigNodePropertyInteger.fromJson(json[r'service.ranking']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

