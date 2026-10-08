//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_scripting_java_impl_java_script_engine_factory_properties.g.dart';

/// OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties
///
/// Properties:
/// * [javaPeriodClassdebuginfo] 
/// * [javaPeriodJavaEncoding] 
/// * [javaPeriodCompilerSourceVM] 
/// * [javaPeriodCompilerTargetVM] 
@BuiltValue()
abstract class OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties implements Built<OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties, OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryPropertiesBuilder> {
  @BuiltValueField(wireName: r'java.classdebuginfo')
  ConfigNodePropertyBoolean? get javaPeriodClassdebuginfo;

  @BuiltValueField(wireName: r'java.javaEncoding')
  ConfigNodePropertyString? get javaPeriodJavaEncoding;

  @BuiltValueField(wireName: r'java.compilerSourceVM')
  ConfigNodePropertyString? get javaPeriodCompilerSourceVM;

  @BuiltValueField(wireName: r'java.compilerTargetVM')
  ConfigNodePropertyString? get javaPeriodCompilerTargetVM;

  OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties._();

  factory OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties([void updates(OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryPropertiesBuilder b)]) = _$OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties> get serializer => _$OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryPropertiesSerializer();
}

class _$OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties, _$OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties];

  @override
  final String wireName = r'OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.javaPeriodClassdebuginfo != null) {
      yield r'java.classdebuginfo';
      yield serializers.serialize(
        object.javaPeriodClassdebuginfo,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.javaPeriodJavaEncoding != null) {
      yield r'java.javaEncoding';
      yield serializers.serialize(
        object.javaPeriodJavaEncoding,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.javaPeriodCompilerSourceVM != null) {
      yield r'java.compilerSourceVM';
      yield serializers.serialize(
        object.javaPeriodCompilerSourceVM,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.javaPeriodCompilerTargetVM != null) {
      yield r'java.compilerTargetVM';
      yield serializers.serialize(
        object.javaPeriodCompilerTargetVM,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'java.classdebuginfo':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.javaPeriodClassdebuginfo.replace(valueDes);
          break;
        case r'java.javaEncoding':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.javaPeriodJavaEncoding.replace(valueDes);
          break;
        case r'java.compilerSourceVM':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.javaPeriodCompilerSourceVM.replace(valueDes);
          break;
        case r'java.compilerTargetVM':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.javaPeriodCompilerTargetVM.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryPropertiesBuilder();
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

