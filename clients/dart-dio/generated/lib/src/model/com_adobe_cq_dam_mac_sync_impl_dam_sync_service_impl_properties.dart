//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties.g.dart';

/// ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties
///
/// Properties:
/// * [comPeriodAdobePeriodCqPeriodDamPeriodMacPeriodSyncPeriodDamsyncservicePeriodRegisteredPaths] 
/// * [comPeriodAdobePeriodCqPeriodDamPeriodMacPeriodSyncPeriodDamsyncservicePeriodSyncPeriodRenditions] 
/// * [comPeriodAdobePeriodCqPeriodDamPeriodMacPeriodSyncPeriodDamsyncservicePeriodReplicatePeriodThreadPeriodWaitPeriodMs] 
/// * [comPeriodAdobePeriodCqPeriodDamPeriodMacPeriodSyncPeriodDamsyncservicePeriodPlatform] 
@BuiltValue()
abstract class ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties implements Built<ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties, ComAdobeCqDamMacSyncImplDAMSyncServiceImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths')
  ConfigNodePropertyArray? get comPeriodAdobePeriodCqPeriodDamPeriodMacPeriodSyncPeriodDamsyncservicePeriodRegisteredPaths;

  @BuiltValueField(wireName: r'com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions')
  ConfigNodePropertyBoolean? get comPeriodAdobePeriodCqPeriodDamPeriodMacPeriodSyncPeriodDamsyncservicePeriodSyncPeriodRenditions;

  @BuiltValueField(wireName: r'com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.ms')
  ConfigNodePropertyInteger? get comPeriodAdobePeriodCqPeriodDamPeriodMacPeriodSyncPeriodDamsyncservicePeriodReplicatePeriodThreadPeriodWaitPeriodMs;

  @BuiltValueField(wireName: r'com.adobe.cq.dam.mac.sync.damsyncservice.platform')
  ConfigNodePropertyDropDown? get comPeriodAdobePeriodCqPeriodDamPeriodMacPeriodSyncPeriodDamsyncservicePeriodPlatform;

  ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties._();

  factory ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties([void updates(ComAdobeCqDamMacSyncImplDAMSyncServiceImplPropertiesBuilder b)]) = _$ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqDamMacSyncImplDAMSyncServiceImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties> get serializer => _$ComAdobeCqDamMacSyncImplDAMSyncServiceImplPropertiesSerializer();
}

class _$ComAdobeCqDamMacSyncImplDAMSyncServiceImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties, _$ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties];

  @override
  final String wireName = r'ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.comPeriodAdobePeriodCqPeriodDamPeriodMacPeriodSyncPeriodDamsyncservicePeriodRegisteredPaths != null) {
      yield r'com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths';
      yield serializers.serialize(
        object.comPeriodAdobePeriodCqPeriodDamPeriodMacPeriodSyncPeriodDamsyncservicePeriodRegisteredPaths,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.comPeriodAdobePeriodCqPeriodDamPeriodMacPeriodSyncPeriodDamsyncservicePeriodSyncPeriodRenditions != null) {
      yield r'com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions';
      yield serializers.serialize(
        object.comPeriodAdobePeriodCqPeriodDamPeriodMacPeriodSyncPeriodDamsyncservicePeriodSyncPeriodRenditions,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.comPeriodAdobePeriodCqPeriodDamPeriodMacPeriodSyncPeriodDamsyncservicePeriodReplicatePeriodThreadPeriodWaitPeriodMs != null) {
      yield r'com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.ms';
      yield serializers.serialize(
        object.comPeriodAdobePeriodCqPeriodDamPeriodMacPeriodSyncPeriodDamsyncservicePeriodReplicatePeriodThreadPeriodWaitPeriodMs,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.comPeriodAdobePeriodCqPeriodDamPeriodMacPeriodSyncPeriodDamsyncservicePeriodPlatform != null) {
      yield r'com.adobe.cq.dam.mac.sync.damsyncservice.platform';
      yield serializers.serialize(
        object.comPeriodAdobePeriodCqPeriodDamPeriodMacPeriodSyncPeriodDamsyncservicePeriodPlatform,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqDamMacSyncImplDAMSyncServiceImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodCqPeriodDamPeriodMacPeriodSyncPeriodDamsyncservicePeriodRegisteredPaths.replace(valueDes);
          break;
        case r'com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodCqPeriodDamPeriodMacPeriodSyncPeriodDamsyncservicePeriodSyncPeriodRenditions.replace(valueDes);
          break;
        case r'com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.ms':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodCqPeriodDamPeriodMacPeriodSyncPeriodDamsyncservicePeriodReplicatePeriodThreadPeriodWaitPeriodMs.replace(valueDes);
          break;
        case r'com.adobe.cq.dam.mac.sync.damsyncservice.platform':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodCqPeriodDamPeriodMacPeriodSyncPeriodDamsyncservicePeriodPlatform.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqDamMacSyncImplDAMSyncServiceImplPropertiesBuilder();
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

