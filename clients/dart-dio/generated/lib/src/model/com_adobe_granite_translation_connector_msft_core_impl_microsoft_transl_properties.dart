//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_properties.g.dart';

/// ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties
///
/// Properties:
/// * [translationFactory] 
/// * [defaultConnectorLabel] 
/// * [defaultConnectorAttribution] 
/// * [defaultConnectorWorkspaceId] 
/// * [defaultConnectorSubscriptionKey] 
/// * [languageMapLocation] 
/// * [categoryMapLocation] 
/// * [retryAttempts] 
/// * [timeoutCount] 
@BuiltValue()
abstract class ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties implements Built<ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties, ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesBuilder> {
  @BuiltValueField(wireName: r'translationFactory')
  ConfigNodePropertyString? get translationFactory;

  @BuiltValueField(wireName: r'defaultConnectorLabel')
  ConfigNodePropertyString? get defaultConnectorLabel;

  @BuiltValueField(wireName: r'defaultConnectorAttribution')
  ConfigNodePropertyString? get defaultConnectorAttribution;

  @BuiltValueField(wireName: r'defaultConnectorWorkspaceId')
  ConfigNodePropertyString? get defaultConnectorWorkspaceId;

  @BuiltValueField(wireName: r'defaultConnectorSubscriptionKey')
  ConfigNodePropertyString? get defaultConnectorSubscriptionKey;

  @BuiltValueField(wireName: r'languageMapLocation')
  ConfigNodePropertyString? get languageMapLocation;

  @BuiltValueField(wireName: r'categoryMapLocation')
  ConfigNodePropertyString? get categoryMapLocation;

  @BuiltValueField(wireName: r'retryAttempts')
  ConfigNodePropertyInteger? get retryAttempts;

  @BuiltValueField(wireName: r'timeoutCount')
  ConfigNodePropertyInteger? get timeoutCount;

  ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties._();

  factory ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties([void updates(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesBuilder b)]) = _$ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties> get serializer => _$ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesSerializer();
}

class _$ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties, _$ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties];

  @override
  final String wireName = r'ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.translationFactory != null) {
      yield r'translationFactory';
      yield serializers.serialize(
        object.translationFactory,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.defaultConnectorLabel != null) {
      yield r'defaultConnectorLabel';
      yield serializers.serialize(
        object.defaultConnectorLabel,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.defaultConnectorAttribution != null) {
      yield r'defaultConnectorAttribution';
      yield serializers.serialize(
        object.defaultConnectorAttribution,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.defaultConnectorWorkspaceId != null) {
      yield r'defaultConnectorWorkspaceId';
      yield serializers.serialize(
        object.defaultConnectorWorkspaceId,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.defaultConnectorSubscriptionKey != null) {
      yield r'defaultConnectorSubscriptionKey';
      yield serializers.serialize(
        object.defaultConnectorSubscriptionKey,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.languageMapLocation != null) {
      yield r'languageMapLocation';
      yield serializers.serialize(
        object.languageMapLocation,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.categoryMapLocation != null) {
      yield r'categoryMapLocation';
      yield serializers.serialize(
        object.categoryMapLocation,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.retryAttempts != null) {
      yield r'retryAttempts';
      yield serializers.serialize(
        object.retryAttempts,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.timeoutCount != null) {
      yield r'timeoutCount';
      yield serializers.serialize(
        object.timeoutCount,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'translationFactory':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.translationFactory.replace(valueDes);
          break;
        case r'defaultConnectorLabel':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.defaultConnectorLabel.replace(valueDes);
          break;
        case r'defaultConnectorAttribution':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.defaultConnectorAttribution.replace(valueDes);
          break;
        case r'defaultConnectorWorkspaceId':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.defaultConnectorWorkspaceId.replace(valueDes);
          break;
        case r'defaultConnectorSubscriptionKey':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.defaultConnectorSubscriptionKey.replace(valueDes);
          break;
        case r'languageMapLocation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.languageMapLocation.replace(valueDes);
          break;
        case r'categoryMapLocation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.categoryMapLocation.replace(valueDes);
          break;
        case r'retryAttempts':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.retryAttempts.replace(valueDes);
          break;
        case r'timeoutCount':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.timeoutCount.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesBuilder();
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

