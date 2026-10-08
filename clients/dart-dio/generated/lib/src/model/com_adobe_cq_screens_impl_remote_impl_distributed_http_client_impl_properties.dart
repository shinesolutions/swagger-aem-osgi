//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_screens_impl_remote_impl_distributed_http_client_impl_properties.g.dart';

/// ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties
///
/// Properties:
/// * [comPeriodAdobePeriodAemPeriodScreensPeriodImplPeriodRemotePeriodRequestTimeout] 
@BuiltValue()
abstract class ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties implements Built<ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties, ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'com.adobe.aem.screens.impl.remote.request_timeout')
  ConfigNodePropertyInteger? get comPeriodAdobePeriodAemPeriodScreensPeriodImplPeriodRemotePeriodRequestTimeout;

  ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties._();

  factory ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties([void updates(ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplPropertiesBuilder b)]) = _$ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties> get serializer => _$ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplPropertiesSerializer();
}

class _$ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties, _$ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties];

  @override
  final String wireName = r'ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.comPeriodAdobePeriodAemPeriodScreensPeriodImplPeriodRemotePeriodRequestTimeout != null) {
      yield r'com.adobe.aem.screens.impl.remote.request_timeout';
      yield serializers.serialize(
        object.comPeriodAdobePeriodAemPeriodScreensPeriodImplPeriodRemotePeriodRequestTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'com.adobe.aem.screens.impl.remote.request_timeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodAemPeriodScreensPeriodImplPeriodRemotePeriodRequestTimeout.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplPropertiesBuilder();
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

