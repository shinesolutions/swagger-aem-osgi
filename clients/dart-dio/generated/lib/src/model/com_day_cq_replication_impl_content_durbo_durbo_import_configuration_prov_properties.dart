//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_properties.g.dart';

/// ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties
///
/// Properties:
/// * [preservePeriodHierarchyPeriodNodes] 
/// * [ignorePeriodVersioning] 
/// * [importPeriodAcl] 
/// * [savePeriodThreshold] 
/// * [preservePeriodUserPeriodPaths] 
/// * [preservePeriodUuid] 
/// * [preservePeriodUuidPeriodNodetypes] 
/// * [preservePeriodUuidPeriodSubtrees] 
/// * [autoPeriodCommit] 
@BuiltValue()
abstract class ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties implements Built<ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties, ComDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesBuilder> {
  @BuiltValueField(wireName: r'preserve.hierarchy.nodes')
  ConfigNodePropertyBoolean? get preservePeriodHierarchyPeriodNodes;

  @BuiltValueField(wireName: r'ignore.versioning')
  ConfigNodePropertyBoolean? get ignorePeriodVersioning;

  @BuiltValueField(wireName: r'import.acl')
  ConfigNodePropertyBoolean? get importPeriodAcl;

  @BuiltValueField(wireName: r'save.threshold')
  ConfigNodePropertyInteger? get savePeriodThreshold;

  @BuiltValueField(wireName: r'preserve.user.paths')
  ConfigNodePropertyBoolean? get preservePeriodUserPeriodPaths;

  @BuiltValueField(wireName: r'preserve.uuid')
  ConfigNodePropertyBoolean? get preservePeriodUuid;

  @BuiltValueField(wireName: r'preserve.uuid.nodetypes')
  ConfigNodePropertyArray? get preservePeriodUuidPeriodNodetypes;

  @BuiltValueField(wireName: r'preserve.uuid.subtrees')
  ConfigNodePropertyArray? get preservePeriodUuidPeriodSubtrees;

  @BuiltValueField(wireName: r'auto.commit')
  ConfigNodePropertyBoolean? get autoPeriodCommit;

  ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties._();

  factory ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties([void updates(ComDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesBuilder b)]) = _$ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties> get serializer => _$ComDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesSerializer();
}

class _$ComDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesSerializer implements PrimitiveSerializer<ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties, _$ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties];

  @override
  final String wireName = r'ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.preservePeriodHierarchyPeriodNodes != null) {
      yield r'preserve.hierarchy.nodes';
      yield serializers.serialize(
        object.preservePeriodHierarchyPeriodNodes,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.ignorePeriodVersioning != null) {
      yield r'ignore.versioning';
      yield serializers.serialize(
        object.ignorePeriodVersioning,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.importPeriodAcl != null) {
      yield r'import.acl';
      yield serializers.serialize(
        object.importPeriodAcl,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.savePeriodThreshold != null) {
      yield r'save.threshold';
      yield serializers.serialize(
        object.savePeriodThreshold,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.preservePeriodUserPeriodPaths != null) {
      yield r'preserve.user.paths';
      yield serializers.serialize(
        object.preservePeriodUserPeriodPaths,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.preservePeriodUuid != null) {
      yield r'preserve.uuid';
      yield serializers.serialize(
        object.preservePeriodUuid,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.preservePeriodUuidPeriodNodetypes != null) {
      yield r'preserve.uuid.nodetypes';
      yield serializers.serialize(
        object.preservePeriodUuidPeriodNodetypes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.preservePeriodUuidPeriodSubtrees != null) {
      yield r'preserve.uuid.subtrees';
      yield serializers.serialize(
        object.preservePeriodUuidPeriodSubtrees,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.autoPeriodCommit != null) {
      yield r'auto.commit';
      yield serializers.serialize(
        object.autoPeriodCommit,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'preserve.hierarchy.nodes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.preservePeriodHierarchyPeriodNodes.replace(valueDes);
          break;
        case r'ignore.versioning':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.ignorePeriodVersioning.replace(valueDes);
          break;
        case r'import.acl':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.importPeriodAcl.replace(valueDes);
          break;
        case r'save.threshold':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.savePeriodThreshold.replace(valueDes);
          break;
        case r'preserve.user.paths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.preservePeriodUserPeriodPaths.replace(valueDes);
          break;
        case r'preserve.uuid':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.preservePeriodUuid.replace(valueDes);
          break;
        case r'preserve.uuid.nodetypes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.preservePeriodUuidPeriodNodetypes.replace(valueDes);
          break;
        case r'preserve.uuid.subtrees':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.preservePeriodUuidPeriodSubtrees.replace(valueDes);
          break;
        case r'auto.commit':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.autoPeriodCommit.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

