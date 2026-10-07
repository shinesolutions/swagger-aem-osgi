//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties {
  /// Returns a new [ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties] instance.
  ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties({
    this.servicePeriodRanking,
    this.tagpattern,
    this.componentPeriodResourceType,
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
  ConfigNodePropertyString? tagpattern;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? componentPeriodResourceType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties &&
    other.servicePeriodRanking == servicePeriodRanking &&
    other.tagpattern == tagpattern &&
    other.componentPeriodResourceType == componentPeriodResourceType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (servicePeriodRanking == null ? 0 : servicePeriodRanking!.hashCode) +
    (tagpattern == null ? 0 : tagpattern!.hashCode) +
    (componentPeriodResourceType == null ? 0 : componentPeriodResourceType!.hashCode);

  @override
  String toString() => 'ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties[servicePeriodRanking=$servicePeriodRanking, tagpattern=$tagpattern, componentPeriodResourceType=$componentPeriodResourceType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.servicePeriodRanking != null) {
      json[r'service.ranking'] = this.servicePeriodRanking;
    } else {
      json[r'service.ranking'] = null;
    }
    if (this.tagpattern != null) {
      json[r'tagpattern'] = this.tagpattern;
    } else {
      json[r'tagpattern'] = null;
    }
    if (this.componentPeriodResourceType != null) {
      json[r'component.resourceType'] = this.componentPeriodResourceType;
    } else {
      json[r'component.resourceType'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties(
        servicePeriodRanking: ConfigNodePropertyInteger.fromJson(json[r'service.ranking']),
        tagpattern: ConfigNodePropertyString.fromJson(json[r'tagpattern']),
        componentPeriodResourceType: ConfigNodePropertyString.fromJson(json[r'component.resourceType']),
      );
    }
    return null;
  }

  static List<ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties-objects as value to a dart map
  static Map<String, List<ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

