//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties.g.dart';

/// ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties
///
/// Properties:
/// * [forwardPeriodRequests] 
@BuiltValue()
abstract class ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties implements Built<ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties, ComAdobeGraniteDistributionCoreImplReplicationDistributionTransPropertiesBuilder> {
  @BuiltValueField(wireName: r'forward.requests')
  ConfigNodePropertyBoolean? get forwardPeriodRequests;

  ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties._();

  factory ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties([void updates(ComAdobeGraniteDistributionCoreImplReplicationDistributionTransPropertiesBuilder b)]) = _$ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteDistributionCoreImplReplicationDistributionTransPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties> get serializer => _$ComAdobeGraniteDistributionCoreImplReplicationDistributionTransPropertiesSerializer();
}

class _$ComAdobeGraniteDistributionCoreImplReplicationDistributionTransPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties, _$ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties];

  @override
  final String wireName = r'ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.forwardPeriodRequests != null) {
      yield r'forward.requests';
      yield serializers.serialize(
        object.forwardPeriodRequests,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteDistributionCoreImplReplicationDistributionTransPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'forward.requests':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.forwardPeriodRequests.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteDistributionCoreImplReplicationDistributionTransPropertiesBuilder();
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

