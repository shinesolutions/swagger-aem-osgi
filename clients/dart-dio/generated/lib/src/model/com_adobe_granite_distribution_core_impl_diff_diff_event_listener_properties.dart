//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_distribution_core_impl_diff_diff_event_listener_properties.g.dart';

/// ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties
///
/// Properties:
/// * [diffPath] 
/// * [serviceName] 
/// * [serviceUserPeriodTarget] 
@BuiltValue()
abstract class ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties implements Built<ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties, ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerPropertiesBuilder> {
  @BuiltValueField(wireName: r'diffPath')
  ConfigNodePropertyString? get diffPath;

  @BuiltValueField(wireName: r'serviceName')
  ConfigNodePropertyString? get serviceName;

  @BuiltValueField(wireName: r'serviceUser.target')
  ConfigNodePropertyString? get serviceUserPeriodTarget;

  ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties._();

  factory ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties([void updates(ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerPropertiesBuilder b)]) = _$ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties> get serializer => _$ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerPropertiesSerializer();
}

class _$ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties, _$ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties];

  @override
  final String wireName = r'ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.diffPath != null) {
      yield r'diffPath';
      yield serializers.serialize(
        object.diffPath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.serviceName != null) {
      yield r'serviceName';
      yield serializers.serialize(
        object.serviceName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.serviceUserPeriodTarget != null) {
      yield r'serviceUser.target';
      yield serializers.serialize(
        object.serviceUserPeriodTarget,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'diffPath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.diffPath.replace(valueDes);
          break;
        case r'serviceName':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.serviceName.replace(valueDes);
          break;
        case r'serviceUser.target':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.serviceUserPeriodTarget.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerPropertiesBuilder();
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

