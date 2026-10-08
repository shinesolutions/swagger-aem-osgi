//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_contexthub_impl_context_hub_impl_properties.g.dart';

/// ComAdobeGraniteContexthubImplContextHubImplProperties
///
/// Properties:
/// * [comPeriodAdobePeriodGranitePeriodContexthubPeriodSilentMode] 
/// * [comPeriodAdobePeriodGranitePeriodContexthubPeriodShowUi] 
@BuiltValue()
abstract class ComAdobeGraniteContexthubImplContextHubImplProperties implements Built<ComAdobeGraniteContexthubImplContextHubImplProperties, ComAdobeGraniteContexthubImplContextHubImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'com.adobe.granite.contexthub.silent_mode')
  ConfigNodePropertyBoolean? get comPeriodAdobePeriodGranitePeriodContexthubPeriodSilentMode;

  @BuiltValueField(wireName: r'com.adobe.granite.contexthub.show_ui')
  ConfigNodePropertyBoolean? get comPeriodAdobePeriodGranitePeriodContexthubPeriodShowUi;

  ComAdobeGraniteContexthubImplContextHubImplProperties._();

  factory ComAdobeGraniteContexthubImplContextHubImplProperties([void updates(ComAdobeGraniteContexthubImplContextHubImplPropertiesBuilder b)]) = _$ComAdobeGraniteContexthubImplContextHubImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteContexthubImplContextHubImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteContexthubImplContextHubImplProperties> get serializer => _$ComAdobeGraniteContexthubImplContextHubImplPropertiesSerializer();
}

class _$ComAdobeGraniteContexthubImplContextHubImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteContexthubImplContextHubImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteContexthubImplContextHubImplProperties, _$ComAdobeGraniteContexthubImplContextHubImplProperties];

  @override
  final String wireName = r'ComAdobeGraniteContexthubImplContextHubImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteContexthubImplContextHubImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.comPeriodAdobePeriodGranitePeriodContexthubPeriodSilentMode != null) {
      yield r'com.adobe.granite.contexthub.silent_mode';
      yield serializers.serialize(
        object.comPeriodAdobePeriodGranitePeriodContexthubPeriodSilentMode,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.comPeriodAdobePeriodGranitePeriodContexthubPeriodShowUi != null) {
      yield r'com.adobe.granite.contexthub.show_ui';
      yield serializers.serialize(
        object.comPeriodAdobePeriodGranitePeriodContexthubPeriodShowUi,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteContexthubImplContextHubImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteContexthubImplContextHubImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'com.adobe.granite.contexthub.silent_mode':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodGranitePeriodContexthubPeriodSilentMode.replace(valueDes);
          break;
        case r'com.adobe.granite.contexthub.show_ui':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.comPeriodAdobePeriodGranitePeriodContexthubPeriodShowUi.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteContexthubImplContextHubImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteContexthubImplContextHubImplPropertiesBuilder();
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

