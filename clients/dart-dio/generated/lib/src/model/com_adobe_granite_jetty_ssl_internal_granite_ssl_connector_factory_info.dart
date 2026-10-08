//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_info.g.dart';

/// ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo
///
/// Properties:
/// * [pid] 
/// * [title] 
/// * [description] 
/// * [properties] 
/// * [additionalProperties] 
/// * [bundleLocation] 
/// * [serviceLocation] 
@BuiltValue()
abstract class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo implements Built<ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo, ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfoBuilder> {
  @BuiltValueField(wireName: r'pid')
  String? get pid;

  @BuiltValueField(wireName: r'title')
  String? get title;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'properties')
  ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties? get properties;

  @BuiltValueField(wireName: r'additionalProperties')
  String? get additionalProperties;

  @BuiltValueField(wireName: r'bundle_location')
  String? get bundleLocation;

  @BuiltValueField(wireName: r'service_location')
  String? get serviceLocation;

  ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo._();

  factory ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo([void updates(ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfoBuilder b)]) = _$ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo> get serializer => _$ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfoSerializer();
}

class _$ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfoSerializer implements PrimitiveSerializer<ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo, _$ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo];

  @override
  final String wireName = r'ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.pid != null) {
      yield r'pid';
      yield serializers.serialize(
        object.pid,
        specifiedType: const FullType(String),
      );
    }
    if (object.title != null) {
      yield r'title';
      yield serializers.serialize(
        object.title,
        specifiedType: const FullType(String),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType(String),
      );
    }
    if (object.properties != null) {
      yield r'properties';
      yield serializers.serialize(
        object.properties,
        specifiedType: const FullType(ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties),
      );
    }
    if (object.additionalProperties != null) {
      yield r'additionalProperties';
      yield serializers.serialize(
        object.additionalProperties,
        specifiedType: const FullType(String),
      );
    }
    if (object.bundleLocation != null) {
      yield r'bundle_location';
      yield serializers.serialize(
        object.bundleLocation,
        specifiedType: const FullType(String),
      );
    }
    if (object.serviceLocation != null) {
      yield r'service_location';
      yield serializers.serialize(
        object.serviceLocation,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfoBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'pid':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.pid = valueDes;
          break;
        case r'title':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.title = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
          break;
        case r'properties':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties),
          ) as ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties?;
          if (valueDes == null) continue;
          result.properties.replace(valueDes);
          break;
        case r'additionalProperties':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.additionalProperties = valueDes;
          break;
        case r'bundle_location':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.bundleLocation = valueDes;
          break;
        case r'service_location':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.serviceLocation = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfoBuilder();
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

