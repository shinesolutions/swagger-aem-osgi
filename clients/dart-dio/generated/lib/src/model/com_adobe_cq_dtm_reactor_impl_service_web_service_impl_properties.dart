//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_dtm_reactor_impl_service_web_service_impl_properties.g.dart';

/// ComAdobeCqDtmReactorImplServiceWebServiceImplProperties
///
/// Properties:
/// * [endpointUri] 
/// * [connectionTimeout] 
/// * [socketTimeout] 
@BuiltValue()
abstract class ComAdobeCqDtmReactorImplServiceWebServiceImplProperties implements Built<ComAdobeCqDtmReactorImplServiceWebServiceImplProperties, ComAdobeCqDtmReactorImplServiceWebServiceImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'endpointUri')
  ConfigNodePropertyString? get endpointUri;

  @BuiltValueField(wireName: r'connectionTimeout')
  ConfigNodePropertyInteger? get connectionTimeout;

  @BuiltValueField(wireName: r'socketTimeout')
  ConfigNodePropertyInteger? get socketTimeout;

  ComAdobeCqDtmReactorImplServiceWebServiceImplProperties._();

  factory ComAdobeCqDtmReactorImplServiceWebServiceImplProperties([void updates(ComAdobeCqDtmReactorImplServiceWebServiceImplPropertiesBuilder b)]) = _$ComAdobeCqDtmReactorImplServiceWebServiceImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqDtmReactorImplServiceWebServiceImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqDtmReactorImplServiceWebServiceImplProperties> get serializer => _$ComAdobeCqDtmReactorImplServiceWebServiceImplPropertiesSerializer();
}

class _$ComAdobeCqDtmReactorImplServiceWebServiceImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqDtmReactorImplServiceWebServiceImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqDtmReactorImplServiceWebServiceImplProperties, _$ComAdobeCqDtmReactorImplServiceWebServiceImplProperties];

  @override
  final String wireName = r'ComAdobeCqDtmReactorImplServiceWebServiceImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqDtmReactorImplServiceWebServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.endpointUri != null) {
      yield r'endpointUri';
      yield serializers.serialize(
        object.endpointUri,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.connectionTimeout != null) {
      yield r'connectionTimeout';
      yield serializers.serialize(
        object.connectionTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.socketTimeout != null) {
      yield r'socketTimeout';
      yield serializers.serialize(
        object.socketTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqDtmReactorImplServiceWebServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqDtmReactorImplServiceWebServiceImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'endpointUri':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.endpointUri.replace(valueDes);
          break;
        case r'connectionTimeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.connectionTimeout.replace(valueDes);
          break;
        case r'socketTimeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.socketTimeout.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqDtmReactorImplServiceWebServiceImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqDtmReactorImplServiceWebServiceImplPropertiesBuilder();
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

