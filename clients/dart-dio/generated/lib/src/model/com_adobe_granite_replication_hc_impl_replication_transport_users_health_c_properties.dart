//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_replication_hc_impl_replication_transport_users_health_c_properties.g.dart';

/// ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties
///
/// Properties:
/// * [hcPeriodTags] 
@BuiltValue()
abstract class ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties implements Built<ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties, ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCPropertiesBuilder> {
  @BuiltValueField(wireName: r'hc.tags')
  ConfigNodePropertyArray? get hcPeriodTags;

  ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties._();

  factory ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties([void updates(ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCPropertiesBuilder b)]) = _$ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties> get serializer => _$ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCPropertiesSerializer();
}

class _$ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties, _$ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties];

  @override
  final String wireName = r'ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.hcPeriodTags != null) {
      yield r'hc.tags';
      yield serializers.serialize(
        object.hcPeriodTags,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'hc.tags':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.hcPeriodTags.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCPropertiesBuilder();
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

