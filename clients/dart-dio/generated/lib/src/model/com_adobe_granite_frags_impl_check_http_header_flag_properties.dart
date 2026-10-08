//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_frags_impl_check_http_header_flag_properties.g.dart';

/// ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties
///
/// Properties:
/// * [featurePeriodName] 
/// * [featurePeriodDescription] 
/// * [httpPeriodHeaderPeriodName] 
/// * [httpPeriodHeaderPeriodValuepattern] 
@BuiltValue()
abstract class ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties implements Built<ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties, ComAdobeGraniteFragsImplCheckHttpHeaderFlagPropertiesBuilder> {
  @BuiltValueField(wireName: r'feature.name')
  ConfigNodePropertyString? get featurePeriodName;

  @BuiltValueField(wireName: r'feature.description')
  ConfigNodePropertyString? get featurePeriodDescription;

  @BuiltValueField(wireName: r'http.header.name')
  ConfigNodePropertyString? get httpPeriodHeaderPeriodName;

  @BuiltValueField(wireName: r'http.header.valuepattern')
  ConfigNodePropertyString? get httpPeriodHeaderPeriodValuepattern;

  ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties._();

  factory ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties([void updates(ComAdobeGraniteFragsImplCheckHttpHeaderFlagPropertiesBuilder b)]) = _$ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteFragsImplCheckHttpHeaderFlagPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties> get serializer => _$ComAdobeGraniteFragsImplCheckHttpHeaderFlagPropertiesSerializer();
}

class _$ComAdobeGraniteFragsImplCheckHttpHeaderFlagPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties, _$ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties];

  @override
  final String wireName = r'ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.featurePeriodName != null) {
      yield r'feature.name';
      yield serializers.serialize(
        object.featurePeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.featurePeriodDescription != null) {
      yield r'feature.description';
      yield serializers.serialize(
        object.featurePeriodDescription,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.httpPeriodHeaderPeriodName != null) {
      yield r'http.header.name';
      yield serializers.serialize(
        object.httpPeriodHeaderPeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.httpPeriodHeaderPeriodValuepattern != null) {
      yield r'http.header.valuepattern';
      yield serializers.serialize(
        object.httpPeriodHeaderPeriodValuepattern,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteFragsImplCheckHttpHeaderFlagPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'feature.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.featurePeriodName.replace(valueDes);
          break;
        case r'feature.description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.featurePeriodDescription.replace(valueDes);
          break;
        case r'http.header.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.httpPeriodHeaderPeriodName.replace(valueDes);
          break;
        case r'http.header.valuepattern':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.httpPeriodHeaderPeriodValuepattern.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteFragsImplCheckHttpHeaderFlagPropertiesBuilder();
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

