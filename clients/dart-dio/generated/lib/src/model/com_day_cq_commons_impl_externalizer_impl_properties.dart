//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_commons_impl_externalizer_impl_properties.g.dart';

/// ComDayCqCommonsImplExternalizerImplProperties
///
/// Properties:
/// * [externalizerPeriodDomains] 
/// * [externalizerPeriodHost] 
/// * [externalizerPeriodContextpath] 
/// * [externalizerPeriodEncodedpath] 
@BuiltValue()
abstract class ComDayCqCommonsImplExternalizerImplProperties implements Built<ComDayCqCommonsImplExternalizerImplProperties, ComDayCqCommonsImplExternalizerImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'externalizer.domains')
  ConfigNodePropertyArray? get externalizerPeriodDomains;

  @BuiltValueField(wireName: r'externalizer.host')
  ConfigNodePropertyString? get externalizerPeriodHost;

  @BuiltValueField(wireName: r'externalizer.contextpath')
  ConfigNodePropertyString? get externalizerPeriodContextpath;

  @BuiltValueField(wireName: r'externalizer.encodedpath')
  ConfigNodePropertyBoolean? get externalizerPeriodEncodedpath;

  ComDayCqCommonsImplExternalizerImplProperties._();

  factory ComDayCqCommonsImplExternalizerImplProperties([void updates(ComDayCqCommonsImplExternalizerImplPropertiesBuilder b)]) = _$ComDayCqCommonsImplExternalizerImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqCommonsImplExternalizerImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqCommonsImplExternalizerImplProperties> get serializer => _$ComDayCqCommonsImplExternalizerImplPropertiesSerializer();
}

class _$ComDayCqCommonsImplExternalizerImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqCommonsImplExternalizerImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqCommonsImplExternalizerImplProperties, _$ComDayCqCommonsImplExternalizerImplProperties];

  @override
  final String wireName = r'ComDayCqCommonsImplExternalizerImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqCommonsImplExternalizerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.externalizerPeriodDomains != null) {
      yield r'externalizer.domains';
      yield serializers.serialize(
        object.externalizerPeriodDomains,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.externalizerPeriodHost != null) {
      yield r'externalizer.host';
      yield serializers.serialize(
        object.externalizerPeriodHost,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.externalizerPeriodContextpath != null) {
      yield r'externalizer.contextpath';
      yield serializers.serialize(
        object.externalizerPeriodContextpath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.externalizerPeriodEncodedpath != null) {
      yield r'externalizer.encodedpath';
      yield serializers.serialize(
        object.externalizerPeriodEncodedpath,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqCommonsImplExternalizerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqCommonsImplExternalizerImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'externalizer.domains':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.externalizerPeriodDomains.replace(valueDes);
          break;
        case r'externalizer.host':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.externalizerPeriodHost.replace(valueDes);
          break;
        case r'externalizer.contextpath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.externalizerPeriodContextpath.replace(valueDes);
          break;
        case r'externalizer.encodedpath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.externalizerPeriodEncodedpath.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqCommonsImplExternalizerImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqCommonsImplExternalizerImplPropertiesBuilder();
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

