//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties {
  /// Returns a new [ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties] instance.
  ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties({
    this.preservePeriodHierarchyPeriodNodes,
    this.ignorePeriodVersioning,
    this.importPeriodAcl,
    this.savePeriodThreshold,
    this.preservePeriodUserPeriodPaths,
    this.preservePeriodUuid,
    this.preservePeriodUuidPeriodNodetypes,
    this.preservePeriodUuidPeriodSubtrees,
    this.autoPeriodCommit,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? preservePeriodHierarchyPeriodNodes;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? ignorePeriodVersioning;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? importPeriodAcl;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? savePeriodThreshold;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? preservePeriodUserPeriodPaths;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? preservePeriodUuid;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? preservePeriodUuidPeriodNodetypes;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? preservePeriodUuidPeriodSubtrees;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? autoPeriodCommit;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties &&
    other.preservePeriodHierarchyPeriodNodes == preservePeriodHierarchyPeriodNodes &&
    other.ignorePeriodVersioning == ignorePeriodVersioning &&
    other.importPeriodAcl == importPeriodAcl &&
    other.savePeriodThreshold == savePeriodThreshold &&
    other.preservePeriodUserPeriodPaths == preservePeriodUserPeriodPaths &&
    other.preservePeriodUuid == preservePeriodUuid &&
    other.preservePeriodUuidPeriodNodetypes == preservePeriodUuidPeriodNodetypes &&
    other.preservePeriodUuidPeriodSubtrees == preservePeriodUuidPeriodSubtrees &&
    other.autoPeriodCommit == autoPeriodCommit;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (preservePeriodHierarchyPeriodNodes == null ? 0 : preservePeriodHierarchyPeriodNodes!.hashCode) +
    (ignorePeriodVersioning == null ? 0 : ignorePeriodVersioning!.hashCode) +
    (importPeriodAcl == null ? 0 : importPeriodAcl!.hashCode) +
    (savePeriodThreshold == null ? 0 : savePeriodThreshold!.hashCode) +
    (preservePeriodUserPeriodPaths == null ? 0 : preservePeriodUserPeriodPaths!.hashCode) +
    (preservePeriodUuid == null ? 0 : preservePeriodUuid!.hashCode) +
    (preservePeriodUuidPeriodNodetypes == null ? 0 : preservePeriodUuidPeriodNodetypes!.hashCode) +
    (preservePeriodUuidPeriodSubtrees == null ? 0 : preservePeriodUuidPeriodSubtrees!.hashCode) +
    (autoPeriodCommit == null ? 0 : autoPeriodCommit!.hashCode);

  @override
  String toString() => 'ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties[preservePeriodHierarchyPeriodNodes=$preservePeriodHierarchyPeriodNodes, ignorePeriodVersioning=$ignorePeriodVersioning, importPeriodAcl=$importPeriodAcl, savePeriodThreshold=$savePeriodThreshold, preservePeriodUserPeriodPaths=$preservePeriodUserPeriodPaths, preservePeriodUuid=$preservePeriodUuid, preservePeriodUuidPeriodNodetypes=$preservePeriodUuidPeriodNodetypes, preservePeriodUuidPeriodSubtrees=$preservePeriodUuidPeriodSubtrees, autoPeriodCommit=$autoPeriodCommit]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.preservePeriodHierarchyPeriodNodes != null) {
      json[r'preserve.hierarchy.nodes'] = this.preservePeriodHierarchyPeriodNodes;
    } else {
      json[r'preserve.hierarchy.nodes'] = null;
    }
    if (this.ignorePeriodVersioning != null) {
      json[r'ignore.versioning'] = this.ignorePeriodVersioning;
    } else {
      json[r'ignore.versioning'] = null;
    }
    if (this.importPeriodAcl != null) {
      json[r'import.acl'] = this.importPeriodAcl;
    } else {
      json[r'import.acl'] = null;
    }
    if (this.savePeriodThreshold != null) {
      json[r'save.threshold'] = this.savePeriodThreshold;
    } else {
      json[r'save.threshold'] = null;
    }
    if (this.preservePeriodUserPeriodPaths != null) {
      json[r'preserve.user.paths'] = this.preservePeriodUserPeriodPaths;
    } else {
      json[r'preserve.user.paths'] = null;
    }
    if (this.preservePeriodUuid != null) {
      json[r'preserve.uuid'] = this.preservePeriodUuid;
    } else {
      json[r'preserve.uuid'] = null;
    }
    if (this.preservePeriodUuidPeriodNodetypes != null) {
      json[r'preserve.uuid.nodetypes'] = this.preservePeriodUuidPeriodNodetypes;
    } else {
      json[r'preserve.uuid.nodetypes'] = null;
    }
    if (this.preservePeriodUuidPeriodSubtrees != null) {
      json[r'preserve.uuid.subtrees'] = this.preservePeriodUuidPeriodSubtrees;
    } else {
      json[r'preserve.uuid.subtrees'] = null;
    }
    if (this.autoPeriodCommit != null) {
      json[r'auto.commit'] = this.autoPeriodCommit;
    } else {
      json[r'auto.commit'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties(
        preservePeriodHierarchyPeriodNodes: ConfigNodePropertyBoolean.fromJson(json[r'preserve.hierarchy.nodes']),
        ignorePeriodVersioning: ConfigNodePropertyBoolean.fromJson(json[r'ignore.versioning']),
        importPeriodAcl: ConfigNodePropertyBoolean.fromJson(json[r'import.acl']),
        savePeriodThreshold: ConfigNodePropertyInteger.fromJson(json[r'save.threshold']),
        preservePeriodUserPeriodPaths: ConfigNodePropertyBoolean.fromJson(json[r'preserve.user.paths']),
        preservePeriodUuid: ConfigNodePropertyBoolean.fromJson(json[r'preserve.uuid']),
        preservePeriodUuidPeriodNodetypes: ConfigNodePropertyArray.fromJson(json[r'preserve.uuid.nodetypes']),
        preservePeriodUuidPeriodSubtrees: ConfigNodePropertyArray.fromJson(json[r'preserve.uuid.subtrees']),
        autoPeriodCommit: ConfigNodePropertyBoolean.fromJson(json[r'auto.commit']),
      );
    }
    return null;
  }

  static List<ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties-objects as value to a dart map
  static Map<String, List<ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

