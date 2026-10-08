//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_core_impl_version_purge_task_properties.g.dart';

/// ComDayCqWcmCoreImplVersionPurgeTaskProperties
///
/// Properties:
/// * [versionpurgePeriodPaths] 
/// * [versionpurgePeriodRecursive] 
/// * [versionpurgePeriodMaxVersions] 
/// * [versionpurgePeriodMinVersions] 
/// * [versionpurgePeriodMaxAgeDays] 
@BuiltValue()
abstract class ComDayCqWcmCoreImplVersionPurgeTaskProperties implements Built<ComDayCqWcmCoreImplVersionPurgeTaskProperties, ComDayCqWcmCoreImplVersionPurgeTaskPropertiesBuilder> {
  @BuiltValueField(wireName: r'versionpurge.paths')
  ConfigNodePropertyArray? get versionpurgePeriodPaths;

  @BuiltValueField(wireName: r'versionpurge.recursive')
  ConfigNodePropertyBoolean? get versionpurgePeriodRecursive;

  @BuiltValueField(wireName: r'versionpurge.maxVersions')
  ConfigNodePropertyInteger? get versionpurgePeriodMaxVersions;

  @BuiltValueField(wireName: r'versionpurge.minVersions')
  ConfigNodePropertyInteger? get versionpurgePeriodMinVersions;

  @BuiltValueField(wireName: r'versionpurge.maxAgeDays')
  ConfigNodePropertyInteger? get versionpurgePeriodMaxAgeDays;

  ComDayCqWcmCoreImplVersionPurgeTaskProperties._();

  factory ComDayCqWcmCoreImplVersionPurgeTaskProperties([void updates(ComDayCqWcmCoreImplVersionPurgeTaskPropertiesBuilder b)]) = _$ComDayCqWcmCoreImplVersionPurgeTaskProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmCoreImplVersionPurgeTaskPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmCoreImplVersionPurgeTaskProperties> get serializer => _$ComDayCqWcmCoreImplVersionPurgeTaskPropertiesSerializer();
}

class _$ComDayCqWcmCoreImplVersionPurgeTaskPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmCoreImplVersionPurgeTaskProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmCoreImplVersionPurgeTaskProperties, _$ComDayCqWcmCoreImplVersionPurgeTaskProperties];

  @override
  final String wireName = r'ComDayCqWcmCoreImplVersionPurgeTaskProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmCoreImplVersionPurgeTaskProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.versionpurgePeriodPaths != null) {
      yield r'versionpurge.paths';
      yield serializers.serialize(
        object.versionpurgePeriodPaths,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.versionpurgePeriodRecursive != null) {
      yield r'versionpurge.recursive';
      yield serializers.serialize(
        object.versionpurgePeriodRecursive,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.versionpurgePeriodMaxVersions != null) {
      yield r'versionpurge.maxVersions';
      yield serializers.serialize(
        object.versionpurgePeriodMaxVersions,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.versionpurgePeriodMinVersions != null) {
      yield r'versionpurge.minVersions';
      yield serializers.serialize(
        object.versionpurgePeriodMinVersions,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.versionpurgePeriodMaxAgeDays != null) {
      yield r'versionpurge.maxAgeDays';
      yield serializers.serialize(
        object.versionpurgePeriodMaxAgeDays,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmCoreImplVersionPurgeTaskProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmCoreImplVersionPurgeTaskPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'versionpurge.paths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.versionpurgePeriodPaths.replace(valueDes);
          break;
        case r'versionpurge.recursive':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.versionpurgePeriodRecursive.replace(valueDes);
          break;
        case r'versionpurge.maxVersions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.versionpurgePeriodMaxVersions.replace(valueDes);
          break;
        case r'versionpurge.minVersions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.versionpurgePeriodMinVersions.replace(valueDes);
          break;
        case r'versionpurge.maxAgeDays':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.versionpurgePeriodMaxAgeDays.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmCoreImplVersionPurgeTaskProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmCoreImplVersionPurgeTaskPropertiesBuilder();
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

