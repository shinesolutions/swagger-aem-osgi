//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties.g.dart';

/// ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties
///
/// Properties:
/// * [comPeriodAdobePeriodDamPeriodMacPeriodSyncPeriodClientPeriodSoPeriodTimeout] 
@BuiltValue()
abstract class ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties implements Built<ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties, ComAdobeCqDamMacSyncHelperImplMACSyncClientImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'com.adobe.dam.mac.sync.client.so.timeout')
  ConfigNodePropertyInteger? get comPeriodAdobePeriodDamPeriodMacPeriodSyncPeriodClientPeriodSoPeriodTimeout;

  ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties._();

  factory ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties([void updates(ComAdobeCqDamMacSyncHelperImplMACSyncClientImplPropertiesBuilder b)]) = _$ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqDamMacSyncHelperImplMACSyncClientImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties> get serializer => _$ComAdobeCqDamMacSyncHelperImplMACSyncClientImplPropertiesSerializer();
}

class _$ComAdobeCqDamMacSyncHelperImplMACSyncClientImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties, _$ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties];

  @override
  final String wireName = r'ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.comPeriodAdobePeriodDamPeriodMacPeriodSyncPeriodClientPeriodSoPeriodTimeout != null) {
      yield r'com.adobe.dam.mac.sync.client.so.timeout';
      yield serializers.serialize(
        object.comPeriodAdobePeriodDamPeriodMacPeriodSyncPeriodClientPeriodSoPeriodTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqDamMacSyncHelperImplMACSyncClientImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'com.adobe.dam.mac.sync.client.so.timeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodDamPeriodMacPeriodSyncPeriodClientPeriodSoPeriodTimeout.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqDamMacSyncHelperImplMACSyncClientImplPropertiesBuilder();
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

