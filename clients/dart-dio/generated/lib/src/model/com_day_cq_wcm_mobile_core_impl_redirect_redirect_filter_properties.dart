//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_properties.g.dart';

/// ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties
///
/// Properties:
/// * [redirectPeriodEnabled] 
/// * [redirectPeriodStatsPeriodEnabled] 
/// * [redirectPeriodExtensions] 
/// * [redirectPeriodPaths] 
@BuiltValue()
abstract class ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties implements Built<ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties, ComDayCqWcmMobileCoreImplRedirectRedirectFilterPropertiesBuilder> {
  @BuiltValueField(wireName: r'redirect.enabled')
  ConfigNodePropertyBoolean? get redirectPeriodEnabled;

  @BuiltValueField(wireName: r'redirect.stats.enabled')
  ConfigNodePropertyBoolean? get redirectPeriodStatsPeriodEnabled;

  @BuiltValueField(wireName: r'redirect.extensions')
  ConfigNodePropertyArray? get redirectPeriodExtensions;

  @BuiltValueField(wireName: r'redirect.paths')
  ConfigNodePropertyArray? get redirectPeriodPaths;

  ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties._();

  factory ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties([void updates(ComDayCqWcmMobileCoreImplRedirectRedirectFilterPropertiesBuilder b)]) = _$ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmMobileCoreImplRedirectRedirectFilterPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties> get serializer => _$ComDayCqWcmMobileCoreImplRedirectRedirectFilterPropertiesSerializer();
}

class _$ComDayCqWcmMobileCoreImplRedirectRedirectFilterPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties, _$ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties];

  @override
  final String wireName = r'ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.redirectPeriodEnabled != null) {
      yield r'redirect.enabled';
      yield serializers.serialize(
        object.redirectPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.redirectPeriodStatsPeriodEnabled != null) {
      yield r'redirect.stats.enabled';
      yield serializers.serialize(
        object.redirectPeriodStatsPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.redirectPeriodExtensions != null) {
      yield r'redirect.extensions';
      yield serializers.serialize(
        object.redirectPeriodExtensions,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.redirectPeriodPaths != null) {
      yield r'redirect.paths';
      yield serializers.serialize(
        object.redirectPeriodPaths,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmMobileCoreImplRedirectRedirectFilterPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'redirect.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.redirectPeriodEnabled.replace(valueDes);
          break;
        case r'redirect.stats.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.redirectPeriodStatsPeriodEnabled.replace(valueDes);
          break;
        case r'redirect.extensions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.redirectPeriodExtensions.replace(valueDes);
          break;
        case r'redirect.paths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.redirectPeriodPaths.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmMobileCoreImplRedirectRedirectFilterPropertiesBuilder();
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

