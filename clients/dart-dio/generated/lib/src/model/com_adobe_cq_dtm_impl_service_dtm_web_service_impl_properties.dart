//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_dtm_impl_service_dtm_web_service_impl_properties.g.dart';

/// ComAdobeCqDtmImplServiceDTMWebServiceImplProperties
///
/// Properties:
/// * [connectionPeriodTimeout] 
/// * [socketPeriodTimeout] 
@BuiltValue()
abstract class ComAdobeCqDtmImplServiceDTMWebServiceImplProperties implements Built<ComAdobeCqDtmImplServiceDTMWebServiceImplProperties, ComAdobeCqDtmImplServiceDTMWebServiceImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'connection.timeout')
  ConfigNodePropertyInteger? get connectionPeriodTimeout;

  @BuiltValueField(wireName: r'socket.timeout')
  ConfigNodePropertyInteger? get socketPeriodTimeout;

  ComAdobeCqDtmImplServiceDTMWebServiceImplProperties._();

  factory ComAdobeCqDtmImplServiceDTMWebServiceImplProperties([void updates(ComAdobeCqDtmImplServiceDTMWebServiceImplPropertiesBuilder b)]) = _$ComAdobeCqDtmImplServiceDTMWebServiceImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqDtmImplServiceDTMWebServiceImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqDtmImplServiceDTMWebServiceImplProperties> get serializer => _$ComAdobeCqDtmImplServiceDTMWebServiceImplPropertiesSerializer();
}

class _$ComAdobeCqDtmImplServiceDTMWebServiceImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqDtmImplServiceDTMWebServiceImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqDtmImplServiceDTMWebServiceImplProperties, _$ComAdobeCqDtmImplServiceDTMWebServiceImplProperties];

  @override
  final String wireName = r'ComAdobeCqDtmImplServiceDTMWebServiceImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqDtmImplServiceDTMWebServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.connectionPeriodTimeout != null) {
      yield r'connection.timeout';
      yield serializers.serialize(
        object.connectionPeriodTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.socketPeriodTimeout != null) {
      yield r'socket.timeout';
      yield serializers.serialize(
        object.socketPeriodTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqDtmImplServiceDTMWebServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqDtmImplServiceDTMWebServiceImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'connection.timeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.connectionPeriodTimeout.replace(valueDes);
          break;
        case r'socket.timeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.socketPeriodTimeout.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqDtmImplServiceDTMWebServiceImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqDtmImplServiceDTMWebServiceImplPropertiesBuilder();
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

