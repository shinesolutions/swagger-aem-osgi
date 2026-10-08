//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_core_impl_version_manager_impl_properties.g.dart';

/// ComDayCqWcmCoreImplVersionManagerImplProperties
///
/// Properties:
/// * [versionmanagerPeriodCreateVersionOnActivation] 
/// * [versionmanagerPeriodPurgingEnabled] 
/// * [versionmanagerPeriodPurgePaths] 
/// * [versionmanagerPeriodIvPaths] 
/// * [versionmanagerPeriodMaxAgeDays] 
/// * [versionmanagerPeriodMaxNumberVersions] 
/// * [versionmanagerPeriodMinNumberVersions] 
@BuiltValue()
abstract class ComDayCqWcmCoreImplVersionManagerImplProperties implements Built<ComDayCqWcmCoreImplVersionManagerImplProperties, ComDayCqWcmCoreImplVersionManagerImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'versionmanager.createVersionOnActivation')
  ConfigNodePropertyBoolean? get versionmanagerPeriodCreateVersionOnActivation;

  @BuiltValueField(wireName: r'versionmanager.purgingEnabled')
  ConfigNodePropertyBoolean? get versionmanagerPeriodPurgingEnabled;

  @BuiltValueField(wireName: r'versionmanager.purgePaths')
  ConfigNodePropertyArray? get versionmanagerPeriodPurgePaths;

  @BuiltValueField(wireName: r'versionmanager.ivPaths')
  ConfigNodePropertyArray? get versionmanagerPeriodIvPaths;

  @BuiltValueField(wireName: r'versionmanager.maxAgeDays')
  ConfigNodePropertyInteger? get versionmanagerPeriodMaxAgeDays;

  @BuiltValueField(wireName: r'versionmanager.maxNumberVersions')
  ConfigNodePropertyInteger? get versionmanagerPeriodMaxNumberVersions;

  @BuiltValueField(wireName: r'versionmanager.minNumberVersions')
  ConfigNodePropertyInteger? get versionmanagerPeriodMinNumberVersions;

  ComDayCqWcmCoreImplVersionManagerImplProperties._();

  factory ComDayCqWcmCoreImplVersionManagerImplProperties([void updates(ComDayCqWcmCoreImplVersionManagerImplPropertiesBuilder b)]) = _$ComDayCqWcmCoreImplVersionManagerImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmCoreImplVersionManagerImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmCoreImplVersionManagerImplProperties> get serializer => _$ComDayCqWcmCoreImplVersionManagerImplPropertiesSerializer();
}

class _$ComDayCqWcmCoreImplVersionManagerImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmCoreImplVersionManagerImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmCoreImplVersionManagerImplProperties, _$ComDayCqWcmCoreImplVersionManagerImplProperties];

  @override
  final String wireName = r'ComDayCqWcmCoreImplVersionManagerImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmCoreImplVersionManagerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.versionmanagerPeriodCreateVersionOnActivation != null) {
      yield r'versionmanager.createVersionOnActivation';
      yield serializers.serialize(
        object.versionmanagerPeriodCreateVersionOnActivation,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.versionmanagerPeriodPurgingEnabled != null) {
      yield r'versionmanager.purgingEnabled';
      yield serializers.serialize(
        object.versionmanagerPeriodPurgingEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.versionmanagerPeriodPurgePaths != null) {
      yield r'versionmanager.purgePaths';
      yield serializers.serialize(
        object.versionmanagerPeriodPurgePaths,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.versionmanagerPeriodIvPaths != null) {
      yield r'versionmanager.ivPaths';
      yield serializers.serialize(
        object.versionmanagerPeriodIvPaths,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.versionmanagerPeriodMaxAgeDays != null) {
      yield r'versionmanager.maxAgeDays';
      yield serializers.serialize(
        object.versionmanagerPeriodMaxAgeDays,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.versionmanagerPeriodMaxNumberVersions != null) {
      yield r'versionmanager.maxNumberVersions';
      yield serializers.serialize(
        object.versionmanagerPeriodMaxNumberVersions,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.versionmanagerPeriodMinNumberVersions != null) {
      yield r'versionmanager.minNumberVersions';
      yield serializers.serialize(
        object.versionmanagerPeriodMinNumberVersions,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmCoreImplVersionManagerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmCoreImplVersionManagerImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'versionmanager.createVersionOnActivation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.versionmanagerPeriodCreateVersionOnActivation.replace(valueDes);
          break;
        case r'versionmanager.purgingEnabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.versionmanagerPeriodPurgingEnabled.replace(valueDes);
          break;
        case r'versionmanager.purgePaths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.versionmanagerPeriodPurgePaths.replace(valueDes);
          break;
        case r'versionmanager.ivPaths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.versionmanagerPeriodIvPaths.replace(valueDes);
          break;
        case r'versionmanager.maxAgeDays':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.versionmanagerPeriodMaxAgeDays.replace(valueDes);
          break;
        case r'versionmanager.maxNumberVersions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.versionmanagerPeriodMaxNumberVersions.replace(valueDes);
          break;
        case r'versionmanager.minNumberVersions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.versionmanagerPeriodMinNumberVersions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmCoreImplVersionManagerImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmCoreImplVersionManagerImplPropertiesBuilder();
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

