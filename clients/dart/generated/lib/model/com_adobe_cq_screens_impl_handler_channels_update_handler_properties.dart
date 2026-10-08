//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties {
  /// Returns a new [ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties] instance.
  ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties({
    this.cqPeriodPagesupdatehandlerPeriodImageresourcetypes,
    this.cqPeriodPagesupdatehandlerPeriodProductresourcetypes,
    this.cqPeriodPagesupdatehandlerPeriodVideoresourcetypes,
    this.cqPeriodPagesupdatehandlerPeriodDynamicsequenceresourcetypes,
    this.cqPeriodPagesupdatehandlerPeriodPreviewmodepaths,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? cqPeriodPagesupdatehandlerPeriodImageresourcetypes;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? cqPeriodPagesupdatehandlerPeriodProductresourcetypes;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? cqPeriodPagesupdatehandlerPeriodVideoresourcetypes;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? cqPeriodPagesupdatehandlerPeriodDynamicsequenceresourcetypes;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? cqPeriodPagesupdatehandlerPeriodPreviewmodepaths;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties &&
    other.cqPeriodPagesupdatehandlerPeriodImageresourcetypes == cqPeriodPagesupdatehandlerPeriodImageresourcetypes &&
    other.cqPeriodPagesupdatehandlerPeriodProductresourcetypes == cqPeriodPagesupdatehandlerPeriodProductresourcetypes &&
    other.cqPeriodPagesupdatehandlerPeriodVideoresourcetypes == cqPeriodPagesupdatehandlerPeriodVideoresourcetypes &&
    other.cqPeriodPagesupdatehandlerPeriodDynamicsequenceresourcetypes == cqPeriodPagesupdatehandlerPeriodDynamicsequenceresourcetypes &&
    other.cqPeriodPagesupdatehandlerPeriodPreviewmodepaths == cqPeriodPagesupdatehandlerPeriodPreviewmodepaths;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cqPeriodPagesupdatehandlerPeriodImageresourcetypes == null ? 0 : cqPeriodPagesupdatehandlerPeriodImageresourcetypes!.hashCode) +
    (cqPeriodPagesupdatehandlerPeriodProductresourcetypes == null ? 0 : cqPeriodPagesupdatehandlerPeriodProductresourcetypes!.hashCode) +
    (cqPeriodPagesupdatehandlerPeriodVideoresourcetypes == null ? 0 : cqPeriodPagesupdatehandlerPeriodVideoresourcetypes!.hashCode) +
    (cqPeriodPagesupdatehandlerPeriodDynamicsequenceresourcetypes == null ? 0 : cqPeriodPagesupdatehandlerPeriodDynamicsequenceresourcetypes!.hashCode) +
    (cqPeriodPagesupdatehandlerPeriodPreviewmodepaths == null ? 0 : cqPeriodPagesupdatehandlerPeriodPreviewmodepaths!.hashCode);

  @override
  String toString() => 'ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties[cqPeriodPagesupdatehandlerPeriodImageresourcetypes=$cqPeriodPagesupdatehandlerPeriodImageresourcetypes, cqPeriodPagesupdatehandlerPeriodProductresourcetypes=$cqPeriodPagesupdatehandlerPeriodProductresourcetypes, cqPeriodPagesupdatehandlerPeriodVideoresourcetypes=$cqPeriodPagesupdatehandlerPeriodVideoresourcetypes, cqPeriodPagesupdatehandlerPeriodDynamicsequenceresourcetypes=$cqPeriodPagesupdatehandlerPeriodDynamicsequenceresourcetypes, cqPeriodPagesupdatehandlerPeriodPreviewmodepaths=$cqPeriodPagesupdatehandlerPeriodPreviewmodepaths]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cqPeriodPagesupdatehandlerPeriodImageresourcetypes != null) {
      json[r'cq.pagesupdatehandler.imageresourcetypes'] = this.cqPeriodPagesupdatehandlerPeriodImageresourcetypes;
    } else {
      json[r'cq.pagesupdatehandler.imageresourcetypes'] = null;
    }
    if (this.cqPeriodPagesupdatehandlerPeriodProductresourcetypes != null) {
      json[r'cq.pagesupdatehandler.productresourcetypes'] = this.cqPeriodPagesupdatehandlerPeriodProductresourcetypes;
    } else {
      json[r'cq.pagesupdatehandler.productresourcetypes'] = null;
    }
    if (this.cqPeriodPagesupdatehandlerPeriodVideoresourcetypes != null) {
      json[r'cq.pagesupdatehandler.videoresourcetypes'] = this.cqPeriodPagesupdatehandlerPeriodVideoresourcetypes;
    } else {
      json[r'cq.pagesupdatehandler.videoresourcetypes'] = null;
    }
    if (this.cqPeriodPagesupdatehandlerPeriodDynamicsequenceresourcetypes != null) {
      json[r'cq.pagesupdatehandler.dynamicsequenceresourcetypes'] = this.cqPeriodPagesupdatehandlerPeriodDynamicsequenceresourcetypes;
    } else {
      json[r'cq.pagesupdatehandler.dynamicsequenceresourcetypes'] = null;
    }
    if (this.cqPeriodPagesupdatehandlerPeriodPreviewmodepaths != null) {
      json[r'cq.pagesupdatehandler.previewmodepaths'] = this.cqPeriodPagesupdatehandlerPeriodPreviewmodepaths;
    } else {
      json[r'cq.pagesupdatehandler.previewmodepaths'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties(
        cqPeriodPagesupdatehandlerPeriodImageresourcetypes: ConfigNodePropertyArray.fromJson(json[r'cq.pagesupdatehandler.imageresourcetypes']),
        cqPeriodPagesupdatehandlerPeriodProductresourcetypes: ConfigNodePropertyArray.fromJson(json[r'cq.pagesupdatehandler.productresourcetypes']),
        cqPeriodPagesupdatehandlerPeriodVideoresourcetypes: ConfigNodePropertyArray.fromJson(json[r'cq.pagesupdatehandler.videoresourcetypes']),
        cqPeriodPagesupdatehandlerPeriodDynamicsequenceresourcetypes: ConfigNodePropertyArray.fromJson(json[r'cq.pagesupdatehandler.dynamicsequenceresourcetypes']),
        cqPeriodPagesupdatehandlerPeriodPreviewmodepaths: ConfigNodePropertyArray.fromJson(json[r'cq.pagesupdatehandler.previewmodepaths']),
      );
    }
    return null;
  }

  static List<ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

